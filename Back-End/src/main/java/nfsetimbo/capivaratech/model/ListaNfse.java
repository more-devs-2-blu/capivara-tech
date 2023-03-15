package nfsetimbo.capivaratech.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import nfsetimbo.capivaratech.bean.enums.TributaMunicipioPrestador;

import java.io.Serializable;

public class ListaNfse implements Serializable {
   private TributaMunicipioPrestador tributaMunicipioPrestador;
   private int codigoLocalPrestacaoServico = 8357;
   private int unidadeCodigo = 43;
   private int unidadeQuantidade = 1;
   private double unidadeValorUnitario = 1.0;
   private  int  codigoItemListaServico = 9;
   private  String descritivo = "teste";
   private double aliquotaItemListaServico = 5.00;
   private double situacaoTributaria;
   private double valorTributavel;

   public TributaMunicipioPrestador getTributaMunicipioPrestador() {
      return tributaMunicipioPrestador;
   }

   public void setTributaMunicipioPrestador(TributaMunicipioPrestador tributaMunicipioPrestador) {
      this.tributaMunicipioPrestador = tributaMunicipioPrestador;
   }

   public int getCodigoLocalPrestacaoServico() {
      return codigoLocalPrestacaoServico;
   }

   public void setCodigoLocalPrestacaoServico(int codigoLocalPrestacaoServico) {
      this.codigoLocalPrestacaoServico = codigoLocalPrestacaoServico;
   }

   public int getUnidadeCodigo() {
      return unidadeCodigo;
   }

   public void setUnidadeCodigo(int unidadeCodigo) {
      this.unidadeCodigo = unidadeCodigo;
   }

   public int getUnidadeQuantidade() {
      return unidadeQuantidade;
   }

   public void setUnidadeQuantidade(int unidadeQuantidade) {
      this.unidadeQuantidade = unidadeQuantidade;
   }

   public double getUnidadeValorUnitario() {
      return unidadeValorUnitario;
   }

   public void setUnidadeValorUnitario(double unidadeValorUnitario) {
      this.unidadeValorUnitario = unidadeValorUnitario;
   }

   public int getCodigoItemListaServico() {
      return codigoItemListaServico;
   }

   public void setCodigoItemListaServico(int codigoItemListaServico) {
      this.codigoItemListaServico = codigoItemListaServico;
   }

   public String getDescritivo() {
      return descritivo;
   }

   public void setDescritivo(String descritivo) {
      this.descritivo = descritivo;
   }

   public double getAliquotaItemListaServico() {
      return aliquotaItemListaServico;
   }

   public void setAliquotaItemListaServico(double aliquotaItemListaServico) {
      this.aliquotaItemListaServico = aliquotaItemListaServico;
   }

   public double getSituacaoTributaria() {
      return situacaoTributaria;
   }

   public void setSituacaoTributaria(double situacaoTributaria) {
      this.situacaoTributaria = situacaoTributaria;
   }

   public double getValorTributavel() {
      return valorTributavel;
   }

   public void setValorTributavel(double valorTributavel) {
      this.valorTributavel = valorTributavel;
   }
}
