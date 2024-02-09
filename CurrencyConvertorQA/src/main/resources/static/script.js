document.addEventListener("DOMContentLoaded", () => {
    const fetchCurrencies = async () => {
        try {
            const response = await fetch("/currencies");
            if (!response.ok) throw new Error(`HTTP error! status: ${response.status}`);

            const data = await response.json();
            const fromSelect = document.getElementById("from");
            const toSelect = document.getElementById("to");

            data.forEach(currency => {
                fromSelect.appendChild(new Option(`${currency.nameFrom} [${currency.fromCurrency}]`, currency.fromCurrency));
                toSelect.appendChild(new Option(`${currency.nameto} [${currency.toCurrency}]`, currency.toCurrency));
            });
        } catch (error) {
            console.error("Error fetching currency data: ", error);
        }
    };

    const convertCurrency = async () => {
        const amount = document.getElementById("amount").value;
        const fromCurrency = document.getElementById("from").value;
        const toCurrency = document.getElementById("to").value;
        const messageBox = document.getElementById("message-box");
        const message = document.getElementById("message");
        messageBox.style.display = 'none';
        // Check if the amount is negative
        if (amount < 0) {
            {
                message.textContent = "Please Enter A Positive Number For The Amount.";
                messageBox.style.display = 'flex'; // Make the message box visible
            }
            return;
        }
        try {
            const queryParams = new URLSearchParams({
                amount: encodeURIComponent(amount),
                fromCurrency: encodeURIComponent(fromCurrency),
                toCurrency: encodeURIComponent(toCurrency)
            });

            const response = await fetch(`/convert?${queryParams}`);
            if (!response.ok) throw new Error(`HTTP error! status: ${response.status}`);

            const { convertedAmount, exchangeRate } = await response.json();
            document.getElementById("result").value = convertedAmount;
            document.getElementById("rate").value = exchangeRate;
        } catch (error) {
            console.error("Error converting currency: ", error);
        }
    };

    fetchCurrencies();

    document.getElementById("convert-btn").addEventListener("click", convertCurrency);
});
