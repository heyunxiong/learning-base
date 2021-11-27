package hyx2021.designpattern.iterator;

import java.util.ArrayList;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/2/2020
 */
public class Client {
    public static void main(String[] args) {
        ArrayList<College> colleges = new ArrayList<College>();

        ComputerCollege computerCollege = new ComputerCollege();

        InfoCollege infoCollege = new InfoCollege();

        colleges.add(computerCollege);
        colleges.add(infoCollege);

        Output output = new Output(colleges);
        output.printCollege();

    }
}
