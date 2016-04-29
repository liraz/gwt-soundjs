package org.lirazs.gwtsoundjs.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public class SoundJsGwtEntryPoint implements EntryPoint {

	interface SoundJsScripts extends ClientBundle {
		SoundJsScripts instance = GWT.create(SoundJsScripts.class);

		@Source("scripts/soundjs-0.6.2.combined.js")
		TextResource soundjs();
	}

	static void loadSoundJs() {
		String text = 
				SoundJsScripts.instance.soundjs().getText();
		ScriptInjector.fromString(text).setWindow(ScriptInjector.TOP_WINDOW).inject();
	}

	@Override
	public void onModuleLoad() {
		loadSoundJs();
	}
}
