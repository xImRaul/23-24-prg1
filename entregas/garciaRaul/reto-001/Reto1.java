class Reto1 {
    public static void main(String[] args) {

        int billetes100 = 0;
        int billetes50 = 0;
        int billetes20 = 0;
        int billetes10 = 0;
        int billetes5 = 0;
        int monedas2 = 0;
        int monedas1 = 0;

        int cantidad_Pagar = 400;
        int cantidad_Entregada = 15532;

        System.out.println("Debes pagar: " + cantidad_Pagar);
        System.out.println("Has entregado: " + cantidad_Entregada);
        System.out.println("-------------------------");

        int cantidad_Devolver = cantidad_Entregada - cantidad_Pagar;

        billetes100 = cantidad_Devolver / 100;
        cantidad_Devolver = cantidad_Devolver - (100 * billetes100);
        billetes50 = cantidad_Devolver / 50;
        cantidad_Devolver = cantidad_Devolver - (50 * billetes50);
        billetes20 = cantidad_Devolver / 20;
        cantidad_Devolver = cantidad_Devolver - (20 * billetes20);
        billetes10 = cantidad_Devolver / 10;
        cantidad_Devolver = cantidad_Devolver - (10 * billetes10);
        billetes5 = cantidad_Devolver / 5;
        cantidad_Devolver = cantidad_Devolver - (5 * billetes5);
        monedas2 = cantidad_Devolver / 2;
        cantidad_Devolver = cantidad_Devolver - (2 * monedas2);
        monedas1 = cantidad_Devolver / 1;
        cantidad_Devolver = cantidad_Devolver - (1 * monedas1);

        System.out.println(billetes100 + " billete(s) de 100€");
        System.out.println(billetes50 + " billete(s) de 50€");
        System.out.println(billetes20 + " billete(s) de 20€");
        System.out.println(billetes10 + " billete(s) de 10€");
        System.out.println(billetes5 + " billete(s) de 5€");
        System.out.println(monedas2 + " moneda(s) de 2€");
        System.out.println(monedas1 + " moneda(s) de 1€");

    }
}