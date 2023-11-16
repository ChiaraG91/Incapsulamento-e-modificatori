public class Main {
    public static void main(String[] args) {

        Auto auto1 = new Auto("Chevrolet","Yenko Camaro 1969", "FC897J", 425);
        //       auto1.marca = "Chevrolet";
        //       auto1.modello = "Yenko Camaro 1969";
        //       auto1.targa = "FC897J";
        //       auto1.cilindrata = 425;


        System.out.println(auto1.getMarca());
        System.out.println(auto1.getModello());
        System.out.println(auto1.getTarga());
        System.out.println(auto1.getCilindrata());



    }
}