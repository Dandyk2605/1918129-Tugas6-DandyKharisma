import android.app.NotificationManager;
import android.content.Context;
import android.support.annotation.NonNull;

import javax.xml.transform.Result;

public class MyWorker extends Worker{
    public MyWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull @Override
    public Result doWork() {
        displayNotification("Ini adalah Task Kamu","Task kamu sudah selesai");
        return Result.success();
    }

    public void displayNotification(String task, String desc){ NotificationManager manager =
            (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SER VICE);

        NotificationChannel channel = new NotificationChannel("terserah",
                "test123", NotificationManager.IMPORTANCE_HIGH); manager.createNotificationChannel(channel);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext(),
                "terserah")
                .setContentTitle(task)
                .setContentText(desc)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE); manager.notify(1, builder.build());
    }

    private Context getApplicationContext() {
    }
}

