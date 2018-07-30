package br.com.teste.selenium.commons.enums;

public enum BandeiraCartaoCreditoEnum {

    MASTERCARD(0, "MasterCard"),
    VISA(1, "Visa"),
    AMEX(2, " American Express");

    private Integer codigo;
    private String descricao;

    BandeiraCartaoCreditoEnum(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static BandeiraCartaoCreditoEnum getPorCodigo(Integer codigo) {
        for (BandeiraCartaoCreditoEnum grupoEnum : BandeiraCartaoCreditoEnum.values()) {
            if (grupoEnum.getCodigo() == codigo) {
                return grupoEnum;
            }
        }
        return null;
    }
}