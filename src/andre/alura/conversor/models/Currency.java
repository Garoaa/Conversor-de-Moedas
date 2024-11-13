package andre.alura.conversor.models;

public record Currency(String base_code, String target_code, String conversion_rate, String conversion_result) {

    @Override
    public String toString() {
        return "Conversor (Moeda base = " + base_code +", Moeda de conversão = " + target_code +", Taxa de conversão = "
                + conversion_rate +", Resultado da conversão = " + conversion_result + ")";
    }
}
