package org.lirazs.gwtsoundjs.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * {src: src, id: id, data:data, defaultPlayProps:defaultPlayProps}
 */
public class LoadedSoundItem extends JavaScriptObject {

    protected LoadedSoundItem() {}

    public static native LoadedSoundItem create() /*-{
        return {};
    }-*/;

    public final native String getSrc() /*-{
        return this.src;
    }-*/;

    public final native String getId() /*-{
        return this.id;
    }-*/;

    public final native JavaScriptObject getData() /*-{
        return this.data;
    }-*/;

    public final native JavaScriptObject getDefaultPlayProps() /*-{
        return this.defaultPlayProps;
    }-*/;
}
