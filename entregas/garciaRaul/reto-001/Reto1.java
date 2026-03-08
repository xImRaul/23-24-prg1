class Reto1 {
    public static void main(String[] args) {
        int cantidadPagar = 400;
        int cantidadEntregada = 15532;
        int cantidadDevolver = cantidadEntregada - cantidadPagar;

        System.out.println("Debes pagar: " + cantidadPagar);
        System.out.println("Has entregado: " + cantidadEntregada);
        System.out.println("Devolución total: " + cantidadDevolver);
        System.out.println("-------------------------");

        int[] denominaciones = {100, 50, 20, 10, 5, 2, 1};

        for (int valor : denominaciones) {
            int unidades = cantidadDevolver / valor;

            if (unidades > 0) {
                String tipo = (valor >= 5) ? "billete(s)" : "moneda(s)";
                System.out.println(unidades + " " + tipo + " de " + valor + "€");
            }
        }
    }
}
