package nfsetimbo.capivaratech.model;

<<<<<<< HEAD
import jakarta.xml.bind.annotation.*;
=======
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
>>>>>>> main
import lombok.Data;
import nfsetimbo.capivaratech.bean.enums.TributaMunicipioPrestador;

import java.io.Serializable;

<<<<<<< HEAD
@XmlType(propOrder = {"tributa_municipio_prestador","codigo_local_prestacaoServico",
        "unidade_codigo", "unidade_quantidade",
        "unidade_valor_unitario", "codigo_item_lista_servico",
        "descritivo", "aliquota_item_lista_servico", "situacao_tributaria", "valor_tributavel"})

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@Data
public class ListaNfse implements Serializable {

   @XmlElement(name = "tributa_municipio_prestador")
   private TributaMunicipioPrestador tributaMunicipioPrestador;
   @XmlElement(name = "codigo_local_prestacao_servico")
   private int codigoLocalPrestacaoServico = 8357;
   @XmlElement(name = "unidade_codigo" )
   private int unidadeCodigo = 43;
   @XmlElement(name = "unidade_quantidade")
   private int unidadeQuantidade = 1;
   @XmlElement(name = "unidade_valor_unitario")
   private String  unidadeValorUnitario;
   @XmlElement(name = "codigo_item_lista_servico")
   private  int  codigoItemListaServico;
   @XmlElement(name = "descritivo")
   private  String descritivo = "teste";
   @XmlElement(name = "aliquota_item_lista_servico")
   private String aliquotaItemListaServico;
   @XmlElement(name = "situacao_tributaria")
   private String situacaoTributaria;
   @XmlElement(name = "valor_tributavel")
=======

@Data
@Entity
public class ListaNfse implements Serializable {

   @Column(name = "tributa_municipio_prestador")
   private TributaMunicipioPrestador tributaMunicipioPrestador;
   @Column(name = "codigo_local_prestacao_servico")
   private int codigoLocalPrestacaoServico = 8357;
   @Column(name = "unidade_codigo" )
   private int unidadeCodigo = 43;
   @Column(name = "unidade_quantidade")
   private int unidadeQuantidade = 1;
   @Column(name = "unidade_valor_unitario")
   private String  unidadeValorUnitario;
   @Column(name = "codigo_item_lista_servico")
   private  int  codigoItemListaServico;
   @Column(name = "descritivo")
   private  String descritivo = "teste";
   @Column(name = "aliquota_item_lista_servico")
   private String aliquotaItemListaServico;
   @Column(name = "situacao_tributaria")
   private String situacaoTributaria;
   @Column(name = "valor_tributavel")
>>>>>>> main
   private String valorTributavel;

   public ListaNfse() {}

   public ListaNfse(TributaMunicipioPrestador tributaMunicipioPrestador, int codigoLocalPrestacaoServico, int unidadeCodigo, int unidadeQuantidade, String unidadeValorUnitario, int codigoItemListaServico, String descritivo, String aliquotaItemListaServico, String situacaoTributaria, String valorTributavel) {
      this.tributaMunicipioPrestador = tributaMunicipioPrestador;
      this.codigoLocalPrestacaoServico = codigoLocalPrestacaoServico;
      this.unidadeCodigo = unidadeCodigo;
      this.unidadeQuantidade = unidadeQuantidade;
      this.unidadeValorUnitario = unidadeValorUnitario;
      this.codigoItemListaServico = codigoItemListaServico;
      this.descritivo = descritivo;
      this.aliquotaItemListaServico = aliquotaItemListaServico;
      this.situacaoTributaria = situacaoTributaria;
      this.valorTributavel = valorTributavel;
   }
}
