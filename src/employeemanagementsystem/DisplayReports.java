/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagementsystem;

import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author Christine Targa
 */
public class DisplayReports  extends JasperReports {

    public void showEmployees() throws JRException {
        m_report_source = "rptEmployees.jrxml";
        m_sql_stmt = "SELECT * FROM employees ORDER BY id";
        showReport();
    }
}
