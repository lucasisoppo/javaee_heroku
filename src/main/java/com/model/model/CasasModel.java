package com.model.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Objects;

@XmlRootElement
@Entity
@Table(name= "casas")


public class CasasModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) //gera codigo automatico
    @Column(name = "casa_codigo")
    Integer codigo;

    @Column(name = "casa_end", length = 50, nullable = false)
    String endereco;

    @Column(name = "casa_valor", length = 50, nullable = true)
    Double valor;

    @ManyToOne
    @JoinColumn(name = "cod_pessoa", referencedColumnName = "pessoa_codigo")
    PessoasModel pessoasModel;

    public CasasModel( Integer codigo, String endereco, Double valor, PessoasModel pessoasModel) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.valor = valor;
        this.pessoasModel = pessoasModel;
    }

    public CasasModel() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CasasModel that = (CasasModel) o;
        return Objects.equals(codigo, that.codigo);
    }





    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public PessoasModel getPessoasModel() {
        return pessoasModel;
    }

    public void setPessoasModel(PessoasModel pessoasModel) {
        this.pessoasModel = pessoasModel;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        return result;
    }


}

