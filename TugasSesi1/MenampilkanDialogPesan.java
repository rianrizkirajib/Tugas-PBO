package TugasSesi1;
import javax.swing.JOptionPane;

public class MenampilkanDialogPesan {
    public static void main(String[] args) {
    // No. 1
    JOptionPane.showMessageDialog(null, "Belajar Java");
    JOptionPane.showMessageDialog(null, "Sangat Mudah Sekali");
    JOptionPane.showMessageDialog(null, "dan Sangat Menyenangkan");
    
    // No. 2
    String input = JOptionPane.showInputDialog("Matkul Apa Yang Anda Pelajari?");
    JOptionPane.showMessageDialog(null, "Belajar " +input+ " sangat mudah.");           
    }
}