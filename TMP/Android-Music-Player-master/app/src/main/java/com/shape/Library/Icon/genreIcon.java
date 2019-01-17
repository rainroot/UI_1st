package com.shape.Library.Icon;import android.content.Context;import android.graphics.LinearGradient;import android.graphics.Path;import Views.api.ShapeView;import Views.api.shapeImg;import android.graphics.Paint;import android.graphics.Canvas;import com.linedeer.player.Ui;public class genreIcon extends shapeImg{ class Path0 extends Path{  	public Path0() {			moveTo(37f, 0f);			quadTo(50f, 0f, 50f, 13f);			lineTo(50f, 37f);			quadTo(50f, 50f, 37f, 50f);			lineTo(13f, 50f);			quadTo(0f, 50f, 0f, 37f);			lineTo(0f, 13f);			quadTo(0f, 0f, 13f, 0f);			lineTo(37f, 0f);	}}class Path1 extends Path{  	public Path1() {			moveTo(32.9f, 14.8f);			lineTo(32.9f, 29.8f);			quadTo(32.9f, 31.9f, 31.95f, 33.6f);			lineTo(30.6f, 35.35f);			quadTo(28.9f, 37.1f, 26.7f, 37.55f);			lineTo(25.15f, 37.7f);			lineTo(25f, 37.7f);			quadTo(21.75f, 37.7f, 19.4f, 35.35f);			quadTo(17.1f, 33.1f, 17.1f, 29.8f);			lineTo(17.1f, 14.8f);			quadTo(17.1f, 11.5f, 19.4f, 9.2f);			quadTo(21.75f, 6.9f, 25f, 6.9f);			lineTo(27.7f, 7.3f);			quadTo(28.25f, 7.5f, 28.8f, 7.85f);			lineTo(30.6f, 9.2f);			quadTo(32.9f, 11.5f, 32.9f, 14.8f);	}}class Path2 extends Path{  	public Path2() {			moveTo(15.75f, 29.55f);			quadTo(15.75f, 33.45f, 18.45f, 36.15f);			quadTo(21.2f, 38.9f, 25.05f, 38.9f);			quadTo(28.9f, 38.9f, 31.65f, 36.15f);			lineTo(33.25f, 34.1f);			quadTo(34.35f, 32.05f, 34.35f, 29.55f);			lineTo(34.35f, 28.8f);			lineTo(33.5f, 28.8f);			lineTo(33.5f, 26.4f);			lineTo(37.45f, 26.4f);			lineTo(37.45f, 28.8f);			lineTo(36.65f, 28.8f);			lineTo(36.65f, 29.75f);			quadTo(36.65f, 32.65f, 35.4f, 35.05f);			quadTo(34.6f, 36.5f, 33.3f, 37.8f);			quadTo(30.45f, 40.65f, 26.6f, 41.1f);			lineTo(26.2f, 41.15f);			lineTo(26.2f, 47.3f);			lineTo(29.5f, 47.3f);			lineTo(29.5f, 49.7f);			lineTo(20.5f, 49.7f);			lineTo(20.5f, 47.3f);			lineTo(23.8f, 47.3f);			lineTo(23.8f, 41.15f);			quadTo(19.95f, 40.7f, 17.1f, 37.8f);			quadTo(13.75f, 34.45f, 13.75f, 29.75f);			lineTo(13.75f, 28.8f);			lineTo(12.6f, 28.8f);			lineTo(12.6f, 26.4f);			lineTo(16.55f, 26.4f);			lineTo(16.55f, 28.8f);			lineTo(15.75f, 28.8f);			lineTo(15.75f, 29.55f);	}}		public Paint P0 = new Paint(); 		public static int Color0 = (0x002f2947); 		public Path0 S0 = new Path0();		public Paint P1 = new Paint(); 		public static int Color1 = (0xFFffffff); 		public Path1 S1 = new Path1();		public Paint P2 = new Paint(); 		public static int Color2 = (0xFFcccccc); 		public Path2 S2 = new Path2();		public static float Ht = 50F; 		public static float Wh = 50F;  		public genreIcon(int width,int height,int x,int y) {			this.width = width;			this.height = height;			init((float)width/(float)Wh, (float)height/(float)Ht, x, y); 			LinearGradient Lg  = null;			S0.transform(matrix);			P0.setColor(0x002f2947);			P0.setAntiAlias(true);			S1.transform(matrix);			P1.setColor(0xFFffffff);			P1.setAntiAlias(true);			S2.transform(matrix);			P2.setColor(0xFFcccccc);			P2.setAntiAlias(true);			mask = S0;			maskPaint = P0;		} 		public void draw(Canvas canvas) { 			if(drawing){				canvas.drawPath(S0, P0);				canvas.drawPath(S1, P1);				canvas.drawPath(S2, P2);			}		} 		@Override 		public void setX(int x) {			super.setX(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);		} 		@Override 		public void setY(int x) {			super.setY(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);		} 		@Override 		public void setSize(int wh, int ht) {			super.setSize(wh, ht);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);		} 		 public static ShapeView getFMview(Context context,boolean mask){		   ShapeView view = new ShapeView(context, Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht));		   final genreIcon viewImg = new genreIcon(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   view.mask = mask;		   view.img = viewImg;		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return view;		 }      		 public static genreIcon getShape(){		   final genreIcon viewImg = new genreIcon(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return viewImg;		 }     }//Finished...! 