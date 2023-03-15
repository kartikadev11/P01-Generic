/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

/**
 *
 * @author karti
 */
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
public class KoleksiMusik extends AbstractTableModel{
    List<Musik> list = new ArrayList<>();
    @Override
    public int getRowCount() {
        return list.size();            
    }

    @Override
    public int getColumnCount() {
        return 2;
    }
    @Override
    synchronized
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0: return list.get(rowIndex).getFileName();
            case 1: return list.get(rowIndex).getFileSize();
            default: return "";
        }
    }
   @Override
   public String getColumnName(int column){
       switch (column) {
            case 0: return "JUDUL LAGU";
            case 1: return "UKURAN";
            default: return "";
       }
   }
   public void add(Musik m){
       list.add(m);
       fireTableRowsInserted(getRowCount(), getColumnCount());
   }
   public void set(int i, Musik m){
       list.add(m);
       fireTableDataChanged();
   }
   public void clear(){
       list.clear();
       fireTableDataChanged();
   }
   public void remove(int row){
       list.remove(row);
       fireTableRowsDeleted(row, row);
   }
   public Musik get(int row){
       return (Musik) list.get(row);
   }

}
