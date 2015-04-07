package com.alaric.norris.open.source.csdnnews;

import android.app.Application ;
import com.nostra13.universalimageloader.core.ImageLoader ;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration ;
/**
 * 上下文类
 * @author Zack White
 */
public class PocketCSNDNewsApp extends Application {
	private static PocketCSNDNewsApp instance;

	/**
	 * 获取Application
	 * 
	 * @return CSDN
	 */
	public static PocketCSNDNewsApp getInstance() {
		if (instance == null) {
			instance = new PocketCSNDNewsApp();
		}
		return instance;
	}

	/**
	 * 获取上下文
	 * 
	 * @return getInstance()
	 */
	public static PocketCSNDNewsApp getContext() {
		return getInstance();
	}

	@Override
	public void onCreate() {
		synchronized (PocketCSNDNewsApp.class) {
			instance = this;
		}
		super.onCreate();
		ImageLoader.getInstance().init(ImageLoaderConfiguration.createDefault(this));// 初始化ImageLoader
	}
}
