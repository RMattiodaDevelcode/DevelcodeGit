package br.com.develcode.common.type;

public enum SectionType {

    TOYS("brinquedos"),
    CARS("carros"),
    ELECTRONIC("eletronicos"),
    KITCHEN("cozinha"),
    BATHROOM("banheiros"),
    ACCESSORIES("acessorios");

    private final String name;

    SectionType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
