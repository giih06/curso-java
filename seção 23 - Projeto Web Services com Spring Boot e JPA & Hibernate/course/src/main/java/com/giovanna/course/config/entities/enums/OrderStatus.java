package com.giovanna.course.config.entities.enums;

public enum OrderStatus {
    WAITING_PAYMENT(1), // Aparece o numero 1 no banco de dados quando usado esse enum
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    // código do tipo enumerado
    private int code; 

    private OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    // os métodos estáticos não são preciso instanciar 
    public static OrderStatus valueOf(int code) {

        // Percorre todos os valores possíveis do OrderStatus, e pra cada um deles é testado o código do parâmetro é correpondente ao enum
        for(OrderStatus value: OrderStatus.values()){
            if (value.getCode() == code) {
                return value;
            }
        }
        // exceção para se o if varrer todos os valores possíveis e nenhum for igual ao parâmetro inserido
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
}
