package swpuiot.com.dagger2learn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import javax.inject.Inject;

import swpuiot.com.dagger2learn.component.DaggerMainComponent;
import swpuiot.com.dagger2learn.module.ActivityModule;
import swpuiot.com.dagger2learn.presenter.MainPresenter;
import swpuiot.com.dagger2learn.view.MainView;

public class MainActivity extends AppCompatActivity implements MainView {
    @Inject
    MainPresenter presenter;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainComponent.builder()
                .activityModule(new ActivityModule(this))
                .build()
                .inject(this);
        button = (Button) findViewById(R.id.btn_show);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.register();
            }
        });
    }


    @Override
    public void toast() {
        Toast.makeText(this, "success", Toast.LENGTH_SHORT).show();
    }
}
