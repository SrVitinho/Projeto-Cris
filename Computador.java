public class Computador {
    String marca;
    float preco;
    int md;
    
    public void mostraPCConfig() {
        SistemaOperacional[] ops = new SistemaOperacional[3];
        ops[0] = new SistemaOperacional();
        ops[1] = new SistemaOperacional();
        ops[2] = new SistemaOperacional();
    
        Hardwarebasico hard[] = new Hardwarebasico[3];
        hard[0] = new Hardwarebasico();
        hard[1] = new Hardwarebasico();
        hard[2] = new Hardwarebasico();

        ops[0].nome = "Linux Ubuntu";
        ops[1].nome = "Windows 8";
        ops[2].nome = "Windows 10";

        ops[0].tipo = 32;
        ops[1].tipo = 64;
        ops[2].tipo = 64;

        hard[0].nome = "Pentium Core i3, 4 Gb Memoria RAM, 500 Gb de HD";
        hard[1].nome = "Pentium Core i5, 8 Gb Memoria RAM, 1Tb de HD";
        hard[2].nome = "Pentium Core i7, 16 Gb Memoria RAM, 2Tb de HD";
        
        hard[0].capacidade = 1200;
        hard[1].capacidade = 2260;
        hard[2].capacidade = 3500;

        if(md == 1){
            marca = "positivo";
            preco = 1300.00F;

        }

        else if(md == 2){
            this.marca = "acer";
            this.preco = 1800.00F;

        }

        else if(md == 3){
            this.marca = "Vaio";
            this.preco = 2800.00F;

        }
        System.out.println(hard[md].nome);
        System.out.println(hard[md].capacidade + " Mhz");
        System.out.println(ops[md].nome + " " + ops[md].tipo + " bits");
    }
}

