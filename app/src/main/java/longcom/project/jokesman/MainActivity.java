package longcom.project.jokesman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView btn_feature_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void feature1(View view) {
        if (btn_feature_1.getText().toString().equals("功能1")) {
            btn_feature_1.setText("1111111");
        } else {
            btn_feature_1.setText("222222");
        }
    }
}
