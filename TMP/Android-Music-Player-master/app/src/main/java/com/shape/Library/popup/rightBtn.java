package com.shape.Library.popup;import android.content.Context;import android.graphics.LinearGradient;import android.graphics.Path;import Views.api.ShapeView;import Views.api.shapeImg;import android.graphics.Paint;import android.graphics.Canvas;import com.linedeer.player.Ui;public class rightBtn extends shapeImg{ class Path0 extends Path{  	public Path0() {			moveTo(0f, 13f);			quadTo(0f, 0f, 13f, 0f);			lineTo(67f, 0f);			quadTo(80f, 0f, 80f, 13f);			lineTo(80f, 27f);			quadTo(80f, 40f, 67f, 40f);			lineTo(13f, 40f);			quadTo(0f, 40f, 0f, 27f);			lineTo(0f, 13f);	}}class Path1 extends Path{  	public Path1() {			moveTo(2f, 13f);			quadTo(2f, 2f, 13f, 2f);			lineTo(67f, 2f);			quadTo(78f, 2f, 78f, 13f);			lineTo(78f, 27f);			quadTo(78f, 38f, 67f, 38f);			lineTo(13f, 38f);			quadTo(2f, 38f, 2f, 27f);			lineTo(2f, 13f);	}}class Path2 extends Path{  	public Path2() {			moveTo(50.65f, 13.65f);			lineTo(36.5f, 27.8f);			lineTo(29.4f, 20.7f);			lineTo(30.85f, 19.25f);			lineTo(36.5f, 24.9f);			lineTo(49.2f, 12.2f);			lineTo(50.65f, 13.65f);	}}		public Paint P0 = new Paint(); 		public static int Color0 = (0xFFd35d69); 		public Path0 S0 = new Path0();		public Paint P1 = new Paint(); 		public static int Color1 = (0xFF373054); 		public Path1 S1 = new Path1();		public Paint P2 = new Paint(); 		public static int Color2 = (0xFFffffff); 		public Path2 S2 = new Path2();		public static float Ht = 40F; 		public static float Wh = 80F;  		public rightBtn(int width,int height,int x,int y) {			this.width = width;			this.height = height;			init((float)width/(float)Wh, (float)height/(float)Ht, x, y); 			LinearGradient Lg  = null;			S0.transform(matrix);			P0.setColor(0xFFd35d69);			P0.setAntiAlias(true);			S1.transform(matrix);			P1.setColor(0xFF373054);			P1.setAntiAlias(true);			S2.transform(matrix);			P2.setColor(0xFFffffff);			P2.setAntiAlias(true);			mask = S0;			maskPaint = P0;		} 		public void draw(Canvas canvas) { 			if(drawing){				canvas.drawPath(S0, P0);				canvas.drawPath(S1, P1);				canvas.drawPath(S2, P2);			}		} 		@Override 		public void setX(int x) {			super.setX(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);		} 		@Override 		public void setY(int x) {			super.setY(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);		} 		@Override 		public void setSize(int wh, int ht) {			super.setSize(wh, ht);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);		} 		 public static ShapeView getFMview(Context context,boolean mask){		   ShapeView view = new ShapeView(context, Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht));		   final rightBtn viewImg = new rightBtn(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   view.mask = mask;		   view.img = viewImg;		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return view;		 }      		 public static rightBtn getShape(){		   final rightBtn viewImg = new rightBtn(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return viewImg;		 }     }//Finished...! 