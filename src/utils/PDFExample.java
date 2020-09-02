/**
 * 
 */
package utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import builders.TableBuilder;
import models.Column;
import models.Employee;
import models.Table;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class PDFExample {
	 // Page configuration
    private static final PDRectangle PAGE_SIZE = PDRectangle.A4;
    private static final float MARGIN = 20;
    private static final boolean IS_LANDSCAPE = true;

    // Font configuration
    private static final PDFont TEXT_FONT = PDType1Font.HELVETICA;
    private static final float FONT_SIZE = 10;

    // Table configuration
    private static final float ROW_HEIGHT = 15;
    private static final float CELL_MARGIN = 2;

    public static Table createContent(List<Employee> employee) {
        // Total size of columns must not be greater than table width.
        List<Column> columns = new ArrayList<Column>();
        columns.add(new Column("FirstName", 90));
        columns.add(new Column("LastName", 90));
        columns.add(new Column("Antiquity", 230));
        columns.add(new Column("Department", 43));
       
        String[][] content = { 
                { "FirstName", "LastName", "fakemail@mock.com", "12345", "yes", "XH4234FSD", "4334", "yFone 5 XS", "31/05/2013 07:15 am", "WEB" },
                { "FirstName", "LastName", "fakemail@mock.com", "12345", "yes", "XH4234FSD", "4334", "yFone 5 XS", "31/05/2013 07:15 am", "WEB" },
                { "FirstName", "LastName", "fakemail@mock.com", "12345", "yes", "XH4234FSD", "4334", "yFone 5 XS", "31/05/2013 07:15 am", "WEB" }
        };

        float tableHeight = IS_LANDSCAPE ? PAGE_SIZE.getWidth() - (2 * MARGIN) : PAGE_SIZE.getHeight() - (2 * MARGIN);

        Table table = new TableBuilder()
            .withCellMargin(CELL_MARGIN)
            .withColumns(columns)
            .withContent(content)
            .withHeight(tableHeight)
            .withNumberOfRows(content.length)
            .withRowHeight(ROW_HEIGHT)
            .withMargin(MARGIN)
            .withPageSize(PAGE_SIZE)
            .withLandscape(IS_LANDSCAPE)
            .withTextFont(TEXT_FONT)
            .withFontSize(FONT_SIZE)
            .build();
        return table;
    }   
}
