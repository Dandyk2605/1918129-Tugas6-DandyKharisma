import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.a1918129tugasprak.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);

        final OneTimeWorkRequest request = new OneTimeWorkRequest.Builder(MyWorker.class).build();

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { WorkManager.getInstance().enqueueUniqueWork(
                    "Notifikasi", ExistingWorkPolicy.REPLACE, request);
            }
        });
    }
}
