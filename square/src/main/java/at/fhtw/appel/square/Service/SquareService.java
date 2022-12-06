package at.fhtw.appel.square.Service;

import at.fhtw.appel.square.dto.Square;
import org.springframework.stereotype.Service;

@Service
public class SquareService {
    private final Square square = new Square();

    public int getSquare() {    //get Message Spring
        return square.getSquare();
    }

    public void setSquare(int squ) {    //set Message Spring
        square.setSquare(squ);
    }
}
