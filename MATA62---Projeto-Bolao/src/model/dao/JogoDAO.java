package model.dao;

import bolao.Executavel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import model.vo.Aposta;
import model.vo.Jogo;

public class JogoDAO {

    public void gerarRelatorio(Jogo relat) throws FileNotFoundException, DocumentException, IOException {
        Document document = new Document(PageSize.A4, 72, 72, 72, 72);
        PdfWriter.getInstance(document, new FileOutputStream("Jogo:" + relat.getTimeA() + "x" + relat.getTimeB() + ".pdf"));
        document.open();
        document.add(new Paragraph("----------SISTEMA INTEGRADO DE RECURSOS HUMANOS-----------"));
        document.add(new Paragraph("\n"));
        document.add(new Paragraph("\n"));
        document.add(new Paragraph("----------RELATÓRIO MENSAL DE CONTROLE DE PONTO-----------"));
        document.add(new Paragraph("\n"));
        document.add(new Paragraph(relat.toString()));
        document.add(new Paragraph("\n"));
        document.add(new Paragraph("Dia " + "     " + "ENTRADA" + "    SAÍDA INTER" + "    ENTRADA INTER" + "      SAÍDA"));
        for (Aposta aposta : Executavel.lApostas) {
//            if (relat.getMatricula() == aposta.getMatricula() && relat.getMes().equals(aposta.getMes()) && relat.getAno() == aposta.getAno()) {
//                document.add(new Paragraph(aposta.getDia() + "------" + aposta.getEnt() + "------------" + aposta.getSaida_intervalo() + "-----------" + aposta.getEnt_intervalo() + "-----------" + aposta.getSaida()));
//            }
        }

        document.close();
        Desktop.getDesktop().open(new File("Jogo:" + relat.getTimeA() + "x" + relat.getTimeB() + ".pdf"));
    }
}
