import java.util.Scanner

class Converter {
    var choice: Int = 0
    var amount: Double = 0.0

    var usd: Double = 0.0
    var eur: Double = 0.0
    var rub: Double = 0.0
    var cny: Double = 0.0
    var chf: Double = 0.0
    var gpb: Double = 0.0

    fun convert() {

        var scanner = Scanner(System.`in`)
        println("Options: ")
        println("Enter 1: convert USD")
        println("Enter 2: convert EUR")
        println("Enter 3: convert RUB")
        println("Enter 4: convert CNY")
        println("Enter 5: convert CHF")
        println("Enter 6: convert GPB")

        println("\nChoose your option: ")
        choice = scanner.nextInt()

        println("Enter quantity: ")
        amount = scanner.nextDouble()


        when(choice) {
            1 -> usdToOther()
            2 -> eurToOther()
            3 -> rubToOther()
            4 -> cnyToOther()
            5 -> chfToOther()
            6 -> gpbToOther()
        }
    }

    fun usdToOther() {
        eur = amount * 1.01
        rub = amount * 61.65
        cny = amount * 7.24
        chf = amount * 1.00
        gpb = amount * 0.88

        println("USD to EUR =  $eur" +
                "\nUSD to RUB = $rub" +
                "\nUSD to CNY = $cny" +
                "\nUSD to CHF = $chf" +
                "\nUSD to GBP = $gpb")
    }

    fun eurToOther() {
        usd = amount * 0.99
        rub = amount * 60.77
        cny = amount * 7.14
        chf = amount * 0.98
        gpb = amount * 0.87

        println("EUR to USD =  $usd" +
                "\nEUR to RUB = $rub" +
                "\nEUR to CNY = $cny" +
                "\nEUR to CHF = $chf" +
                "\nEUR to GBP = $gpb")
    }

    fun rubToOther() {
        usd = amount * 0.016
        eur = amount * 0.016
        cny = amount * 0.12
        chf = amount * 0.016
        gpb = amount * 0.014

        println("RUB to USD =  $usd" +
                "\nRUB to EUR = $eur" +
                "\nRUB to CNY = $cny" +
                "\nRUB to CHF = $chf" +
                "\nRUB to GBP = $gpb")
    }
    fun cnyToOther() {
        usd = amount * 0.14
        eur = amount * 0.14
        rub = amount * 8.46
        chf = amount * 0.14
        gpb = amount * 0.12

        println("CNY to USD =  $usd" +
                "\nCNY to EUR = $eur" +
                "\nCNY to RUB = $rub" +
                "\nCNY to CHF = $chf" +
                "\nCNY to GBP = $gpb")
    }

    fun chfToOther() {
        usd = amount * 1.00
        eur = amount * 1.02
        rub = amount * 61.79
        cny = amount * 7.26
        gpb = amount * 0.89

        println("CHF to USD =  $usd" +
                "\nCHF to EUR = $eur" +
                "\nCHF to RUB = $rub" +
                "\nCHF to CNY = $cny" +
                "\nCHF to GBP = $gpb")
    }

    fun gpbToOther() {
        usd = amount * 1.13
        eur = amount * 1.15
        rub = amount * 69.69
        cny = amount * 8.19
        chf = amount * 1.13

        println("GBP to USD =  $usd" +
                "\nGBP to EUR = $eur" +
                "\nGBP to RUB = $rub" +
                "\nGBP to CNY = $cny" +
                "\nGBP to GBP = $chf")
    }
}
