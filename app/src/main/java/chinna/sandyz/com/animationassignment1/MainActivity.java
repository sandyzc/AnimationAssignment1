package chinna.sandyz.com.animationassignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    Animation fadein;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView =(TextView)findViewById(R.id.textView);
        button = (Button)findViewById(R.id.button);

        fadein = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setVisibility(View.VISIBLE);

                //strt animation

                textView.startAnimation(fadein);
                //textView.startAnimation(fadeout);
            }
        });
    }


}
