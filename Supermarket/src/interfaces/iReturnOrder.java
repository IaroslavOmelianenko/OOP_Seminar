package interfaces;

public interface iReturnOrder {

    /***
     * Метод проверки возможности возврата товара в зависимости кол-ва дней со дня покупки.
     * Каждый тип клиента обладает своим сроком для возврата товара.
     * @param daysFromOrder - кол-во дней со дня покупки.
     * @return true/false возможность возврата.
     */
    boolean checkReturnAvailability(int daysFromOrder);

    /***
     * Метод получения статуса процесса возврата.
     * @param orderId - id покупки.
     * @return статус процесса возврата.
     */
    String getReturnStatus(int orderId);

    /***
     * Метод возврата денег за покупку.
     * Каждый тип клиента обладает своим процентом удержания с суммы покупки при возврате.
     * @param orderPrice - сумма покупки.
     * @return сумму покупки.
     */
    float moneyReturn(int orderPrice);
}
