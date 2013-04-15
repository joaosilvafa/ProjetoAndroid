package com.android.notification;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;

import com.example.projetoandroid.R;

public class CriaNotificacaoPreco extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Recupera o serviço do NotificationManager
		NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

		Notification notificaction = new Notification(R.drawable.ic_launcher,
				"Um novo preço foi encontrado", System.currentTimeMillis());
//
//		notificaction.sound = Uri.withAppendedPath(
//				Audio.Media.INTERNAL_CONTENT_URI, "6");
		// notification.sound = Uri.parse("file:///sdcard/recording33490.3gpp");

		// Flag que vibra e emite um sinal sonoro até o usuário clicar na
		// notificação
//		notificaction.flags |= Notification.FLAG_INSISTENT;

		// Flag utilizada para remover a notificação da toolbar quando usuário
		// tiver clicado nela.
		notificaction.flags |= Notification.FLAG_AUTO_CANCEL;

		// PendingIntent para executar a Activity se o usuário selecionar a
		// notificão
		PendingIntent p = PendingIntent.getActivity(this, 0,
				new Intent(this.getApplicationContext(), CriaNotificacaoPreco.class), 0);

		
		
		
		// Informações
		notificaction.setLatestEventInfo(this, "Um novo preço foi encontrado!", null, p);

		// espera 100ms e vibra por 1000ms, depois espera por 1000 ms e vibra
		// por
		// 1000ms.
//		notificaction.vibrate = new long[] { 100, 1000, 1000, 1000 };

		// id que identifica esta notifição
		notificationManager.notify(R.string.app_name, notificaction);
	}
}