package edu.gannon.project1_yuanjunhu;



        import android.graphics.Color;
        import android.support.v7.app.ActionBarActivity;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.Button;

        import android.widget.TextView;
        import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        final TextView Text = (TextView) findViewById(R.id.text1);
        final Button Button1 = (Button) findViewById(R.id.button1);
        final Button Button2 = (Button) findViewById(R.id.button2);



        Button1.setOnClickListener(new View.OnClickListener()

                                   {
                                       public void onClick (View v){
                                           Button1.setTextColor(Color.RED);
                                           Text.setTextColor(Color.BLUE);

                                       }
                                   }

        );

        Button2.setOnClickListener(new View.OnClickListener()

                                   {
                                       public void onClick (View v){
                                           Button2.setTextColor(Color.YELLOW);
                                           Text.setTextColor(Color.GREEN);
                                       }
                                   }

        );
    }

    public void showToast(View clickedButton) {
        String greetingText = getString(R.string.Text);
        Toast tempMessage =
                Toast.makeText(this, greetingText,
                        Toast.LENGTH_SHORT);
        tempMessage.show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}