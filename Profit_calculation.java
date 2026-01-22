/*
	"Расчет прибыли на криптобирже".
	Задача - расчитать, сколько "чистых" монет получу при продаже криптовалюты;

	Что нужно сделать:
	1. Вычислить сколько денег потрачено на покупку монет с учетом комиссии.
	2. Вычислить сколько денег получено при продаже монет с учетом комиссии.
	3. Вывести на экран чистую прибыль в $.

	Условия повышенной сложности (на логику):
	Решения с методом Math.max();

	Порядок действий:
	- Сначала считаем сумму сделки.
	- Потом комиссию.
	- Потом вычитаем/прибавляем ее.
 */
public class Profit_calculation {
	static void main() {
		double buyPrice = 50000;                                    // Цена покупки 1 монеты $;
		double sellPrice = 54300;                                   // Цена продажи 1 монеты $;
		double amount = 0.025;                                      // Сколько у меня куплено монет BTC;
		double commission = 0.001;                                  // Комиссия биржи при покупке или продаже;

		// Покупка
		double btcPurchase = buyPrice * amount;                                      // Чистая стоимость покупки BTC;
		double commPurchase = btcPurchase * commission;                              // Комиссия за покупку;
		double purchase = btcPurchase + commPurchase;                                // В итоге потрачено денег на покупку;
		System.out.println("Потрачено $ на покупку монет = " + purchase);

		// Продажа
		double btcSell = sellPrice * amount;                                            // Продажа без учета комиссии;
		double feeSell = btcSell * commission;                                          // Комиссия за продажу;
		double forSale = btcSell - feeSell;                                             // Сколько реально пришло денег на счет после продажи;
		System.out.println("Потрачено $ на продажу монет = " + forSale);

		// Прибыль
		double netProfit = forSale - purchase;
		System.out.println("Чистая прибыль $ = " + netProfit);

		// Решение с условием повышенной сложности
		double maxPrice = Math.max(buyPrice, sellPrice);
		System.out.println("Максимальная цена в сделках: " + maxPrice);
	}
}
