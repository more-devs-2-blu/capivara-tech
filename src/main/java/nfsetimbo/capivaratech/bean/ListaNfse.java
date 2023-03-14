package nfsetimbo.capivaratech.bean;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import nfsetimbo.capivaratech.bean.enums.TributaMunicipioPrestador;

import java.io.Serializable;

@XmlType(propOrder = {"tributa_municipio_prestador",
        "codigo_local_prestacaoServico",
        "unidade_codigo", "unidade_quantidade",
        "unidade_valor_unitario", "codigo_item_lista_servico",
        "descritivo", "aliquota_item_lista_servico", "situacao_tributaria", "valor_tributavel"})
public class ListaNfse implements Serializable {
   private TributaMunicipioPrestador tributaMunicipioPrestador;
   private int codigoLocalPrestacaoServico = 8357;
   private int unidadeCodigo = 43;
   private int unidadeQuantidade = 1;
   private Double  unidadeValorUnitario = 1.0;
   private  int  codigoItemListaServico = 9;
   private  String descritivo = "teste";
   private Double aliquotaItemListaServico = 5.00;
   private Double situacaoTributaria;
   private Double valorTributavel;

   @XmlElement(name = "tributa_municipio_prestador")
   public TributaMunicipioPrestador getTributaMunicipioPrestador() {
      return tributaMunicipioPrestador;
   }

   public void setTributaMunicipioPrestador(TributaMunicipioPrestador tributaMunicipioPrestador) {
      this.tributaMunicipioPrestador = tributaMunicipioPrestador;
   }

   @XmlElement(name = "codigo_local_prestacaoServico")
   public int getCodigoLocalPrestacaoServico() {
      return codigoLocalPrestacaoServico;
   }

   public void setCodigoLocalPrestacaoServico(int codigoLocalPrestacaoServico) {
      this.codigoLocalPrestacaoServico = codigoLocalPrestacaoServico;
   }

   @XmlElement(name = "unidade_codigo" )
   public int getUnidadeCodigo() {
      return unidadeCodigo;
   }

   public void setUnidadeCodigo(int unidadeCodigo) {
      this.unidadeCodigo = unidadeCodigo;
   }

   @XmlElement(name = "unidade_quantidade")
   public int getUnidadeQuantidade() {
      return unidadeQuantidade;
   }

   public void setUnidadeQuantidade(int unidadeQuantidade) {
      this.unidadeQuantidade = unidadeQuantidade;
   }

   @XmlElement(name = "unidade_valor_unitario")
   public Double getUnidadeValorUnitario() {
      return unidadeValorUnitario;
   }

   public void setUnidadeValorUnitario(Double unidadeValorUnitario) {
      this.unidadeValorUnitario = unidadeValorUnitario;
   }

   @XmlElement(name = "codigo_item_lista_servico")
   public int getCodigoItemListaServico() {
      return codigoItemListaServico;
   }

   public void setCodigoItemListaServico(int codigoItemListaServico) {
      this.codigoItemListaServico = codigoItemListaServico;
   }

   @XmlElement(name = "descritivo")
   public String getDescritivo() {
      return descritivo;
   }

   public void setDescritivo(String descritivo) {
      this.descritivo = descritivo;
   }

   @XmlElement(name = "aliquota_item_lista_servico")
   public Double getAliquotaItemListaServico() {
      return aliquotaItemListaServico;
   }

   public void setAliquotaItemListaServico(Double aliquotaItemListaServico) {
      this.aliquotaItemListaServico = aliquotaItemListaServico;
   }

   @XmlElement(name = "situacao_tributaria")
   public Double getSituacaoTributaria() {
      return situacaoTributaria;
   }

   public void setSituacaoTributaria(Double situacaoTributaria) {
      this.situacaoTributaria = situacaoTributaria;
   }

   @XmlElement(name = "valor_tributavel")
   public Double getValorTributavel() {
      return valorTributavel;
   }

   public void setValorTributavel(Double valorTributavel) {
      this.valorTributavel = valorTributavel;
   }
}
