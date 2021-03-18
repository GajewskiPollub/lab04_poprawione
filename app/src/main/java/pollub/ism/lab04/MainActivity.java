package pollub.ism.lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    char[][] table = new char[3][3];
    char first_player = 'X';
    char second_player = 'O';
    int turn_number = 1;
/*
    public boolean check_row() {
        if ((table[0][0] == 'X' && table[0][1] == 'X' && table[0][2] == 'X') || (table[0][0] == 'O' && table[0][1] == 'O' && table[0][2] == 'O')) {
            if (table[0][0] == 'X')
                System.out.println("Win X ");
            else
                System.out.println("Win O ");
            return true;
        } else if ((table[1][0] == 'X' && table[1][1] == 'X' && table[1][2] == 'X') || (table[1][0] == 'O' && table[1][1] == 'O' && table[1][2] == 'O')) {
            if (table[1][0] == 'X')
                System.out.println("Win X ");
            else
                System.out.println("Win O");
            return true;
        } else if ((table[2][0] == 'X' && table[2][1] == 'X' && table[2][2] == 'X') || (table[2][0] == 'O' && table[2][1] == 'O' && table[2][2] == 'O')) {
            if (table[2][0] == 'X')
                System.out.println("Win X");
            else
                System.out.println("Win O");
            return true;
        }
        return false;
    }

    public boolean check_column() {
        if ((table[0][0] == 'X' && table[1][0] == 'X' && table[2][0] == 'X') || (table[0][0] == 'O' && table[1][0] == 'O' && table[2][0] == 'O')) {
            if (table[0][0] == 'X')
                System.out.println("Win X ");
            else
                System.out.println("Win O ");
            return true;
        } else if ((table[0][1] == 'X' && table[1][1] == 'X' && table[2][1] == 'X') || (table[0][1] == 'O' && table[1][1] == 'O' && table[2][1] == 'O')) {
            if (table[1][0] == 'X')
                System.out.println("Win X ");
            else
                System.out.println("Win O");
            return true;
        } else if ((table[0][2] == 'X' && table[1][2] == 'X' && table[2][2] == 'X') || (table[0][2] == 'O' && table[1][2] == 'O' && table[2][2] == 'O')) {
            if (table[2][0] == 'X')
                System.out.println("Win X");
            else
                System.out.println("Win O");
            return true;
        }
        return false;
    }

    public boolean check_diagonal() {
        if ((table[0][0] == 'X' && table[1][1] == 'X' && table[2][2] == 'X') || (table[0][0] == 'O' && table[1][1] == 'O' && table[2][2] == 'O')) {
            if (table[0][0] == 'X')
                System.out.println("Win X ");
            else
                System.out.println("Win O ");
            return true;
        } else if ((table[2][0] == 'X' && table[1][1] == 'X' && table[0][2] == 'X') || (table[2][0] == 'O' && table[1][1] == 'O' && table[0][2] == 'O')) {
            if (table[0][0] == 'X')
                System.out.println("Win X ");
            else
                System.out.println("Win O ");
            return true;
        }
        return false;
    }
 */
    public void set_enabled()
    {
        Button button1 = (Button) findViewById(R.id.button_0_0);
        Button button2 = (Button) findViewById(R.id.button_0_1);
        Button button3 = (Button) findViewById(R.id.button_0_2);
        Button button4 = (Button) findViewById(R.id.button_1_0);
        Button button5 = (Button) findViewById(R.id.button_1_1);
        Button button6 = (Button) findViewById(R.id.button_1_2);
        Button button7 = (Button) findViewById(R.id.button_2_0);
        Button button8 = (Button) findViewById(R.id.button_2_1);
        Button button9 = (Button) findViewById(R.id.button_2_2);
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
    }
    public boolean check_winner()
    {
        TextView textView=(TextView)findViewById(R.id.result);
        if ((table[0][0] == 'X' && table[0][1] == 'X' && table[0][2] == 'X') || (table[0][0] == 'O' && table[0][1] == 'O' && table[0][2] == 'O')) {
            if (table[0][0] == 'X')
                textView.setText("Win X");
            else
                textView.setText("Win O");
            set_enabled();
        } else if ((table[1][0] == 'X' && table[1][1] == 'X' && table[1][2] == 'X') || (table[1][0] == 'O' && table[1][1] == 'O' && table[1][2] == 'O')) {
            if (table[1][0] == 'X')
                textView.setText("Win X");
            else
                textView.setText("Win O");
            set_enabled();
        } else if ((table[2][0] == 'X' && table[2][1] == 'X' && table[2][2] == 'X') || (table[2][0] == 'O' && table[2][1] == 'O' && table[2][2] == 'O')) {
            if (table[2][0] == 'X')
                textView.setText("Win X");
            else
                textView.setText("Win O");
            set_enabled();
        } else if ((table[0][0] == 'X' && table[1][0] == 'X' && table[2][0] == 'X') || (table[0][0] == 'O' && table[1][0] == 'O' && table[2][0] == 'O')) {
            if (table[0][0] == 'X')
                textView.setText("Win X");
            else
                textView.setText("Win O");
            set_enabled();
        } else if ((table[0][1] == 'X' && table[1][1] == 'X' && table[2][1] == 'X') || (table[0][1] == 'O' && table[1][1] == 'O' && table[2][1] == 'O')) {
            if (table[0][1] == 'X')
                textView.setText("Win X");
            else
                textView.setText("Win O");
            set_enabled();
        } else if ((table[0][2] == 'X' && table[1][2] == 'X' && table[2][2] == 'X') || (table[0][2] == 'O' && table[1][2] == 'O' && table[2][2] == 'O')) {
            if (table[0][2] == 'X')
                textView.setText("Win X");
            else
                textView.setText("Win O");
            set_enabled();
        } else if ((table[0][0] == 'X' && table[1][1] == 'X' && table[2][2] == 'X') || (table[0][0] == 'O' && table[1][1] == 'O' && table[2][2] == 'O')) {
            if (table[0][0] == 'X')
                textView.setText("Win X");
            else
                textView.setText("Win O");
            set_enabled();
        } else if ((table[2][0] == 'X' && table[1][1] == 'X' && table[0][2] == 'X') || (table[2][0] == 'O' && table[1][1] == 'O' && table[0][2] == 'O')) {
            if (table[2][0] == 'X')
                textView.setText("Win X");
            else
                textView.setText("Win O");
            set_enabled();
        }
        return false;
    }
    public void kliknieciePrzycisku(View view) {
        String[] split = (view.getResources().getResourceEntryName(view.getId())).split("_");
        short row_number = Short.parseShort(split[1]);
        short column_number = Short.parseShort(split[2]);
            if (turn_number % 2 == 1) {
                table[row_number][column_number] = first_player;
            } else {
                table[row_number][column_number] = second_player;
            }
            Button button = (Button) findViewById(view.getId());
            button.setText(Character.toString(table[row_number][column_number]));
            button.setEnabled(false);
            check_winner();
        TextView textView2=(TextView)findViewById(R.id.result);
       if((turn_number==9 )&&(check_winner()==false))
        {
            textView2.setText("Draw");
        }
        turn_number++;
    }
}
