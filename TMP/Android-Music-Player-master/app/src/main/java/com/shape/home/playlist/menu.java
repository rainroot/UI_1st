package com.shape.home.playlist;import android.content.Context;import android.graphics.LinearGradient;import android.graphics.Path;import Views.api.ShapeView;import Views.api.shapeImg;import android.graphics.Paint;import android.graphics.Canvas;import com.linedeer.player.Ui;public class menu extends shapeImg{ class Path0 extends Path{  	public Path0() {			moveTo(40.05f, 50f);			lineTo(0.1f, 50f);			lineTo(0.1f, 0f);			lineTo(40.05f, 0f);			lineTo(40.05f, 50f);	}}class Path1 extends Path{  	public Path1() {			moveTo(14.7f, 17.3f);			lineTo(14.7f, 15.3f);			lineTo(25.45f, 15.3f);			lineTo(25.45f, 17.3f);			lineTo(14.7f, 17.3f);	}}class Path2 extends Path{  	public Path2() {			moveTo(12.7f, 23.1f);			lineTo(12.7f, 21.1f);			lineTo(27.45f, 21.1f);			lineTo(27.45f, 23.1f);			lineTo(12.7f, 23.1f);	}}class Path3 extends Path{  	public Path3() {			moveTo(14.7f, 28.9f);			lineTo(14.7f, 26.9f);			lineTo(25.45f, 26.9f);			lineTo(25.45f, 28.9f);			lineTo(14.7f, 28.9f);	}}class Path4 extends Path{  	public Path4() {			moveTo(14.7f, 34.75f);			lineTo(14.7f, 32.75f);			lineTo(25.45f, 32.75f);			lineTo(25.45f, 34.75f);			lineTo(14.7f, 34.75f);	}}		public Paint P0 = new Paint(); 		public static int Color0 = (0x00d35d69); 		public Path0 S0 = new Path0();		public Paint P1 = new Paint(); 		public static int Color1 = (0xFFd35d69); 		public Path1 S1 = new Path1();		public Paint P2 = new Paint(); 		public static int Color2 = (0xFFd35d69); 		public Path2 S2 = new Path2();		public Paint P3 = new Paint(); 		public static int Color3 = (0xFFd35d69); 		public Path3 S3 = new Path3();		public Paint P4 = new Paint(); 		public static int Color4 = (0xFFd35d69); 		public Path4 S4 = new Path4();		public static float Ht = 50F; 		public static float Wh = 39.95F;  		public menu(int width,int height,int x,int y) {			this.width = width;			this.height = height;			init((float)width/(float)Wh, (float)height/(float)Ht, x, y); 			LinearGradient Lg  = null;			S0.transform(matrix);			P0.setColor(0x00d35d69);			P0.setAntiAlias(true);			S1.transform(matrix);			P1.setColor(0xFFd35d69);			P1.setAntiAlias(true);			S2.transform(matrix);			P2.setColor(0xFFd35d69);			P2.setAntiAlias(true);			S3.transform(matrix);			P3.setColor(0xFFd35d69);			P3.setAntiAlias(true);			S4.transform(matrix);			P4.setColor(0xFFd35d69);			P4.setAntiAlias(true);			mask = S0;			maskPaint = P0;		} 		public void draw(Canvas canvas) { 			if(drawing){				canvas.drawPath(S0, P0);				canvas.drawPath(S1, P1);				canvas.drawPath(S2, P2);				canvas.drawPath(S3, P3);				canvas.drawPath(S4, P4);			}		} 		@Override 		public void setX(int x) {			super.setX(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);			 S4.transform(matrix);		} 		@Override 		public void setY(int x) {			super.setY(x);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);			 S4.transform(matrix);		} 		@Override 		public void setSize(int wh, int ht) {			super.setSize(wh, ht);			 S0.transform(matrix);			 S1.transform(matrix);			 S2.transform(matrix);			 S3.transform(matrix);			 S4.transform(matrix);		} 		 public static ShapeView getFMview(Context context,boolean mask){		   ShapeView view = new ShapeView(context, Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht));		   final menu viewImg = new menu(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   view.mask = mask;		   view.img = viewImg;		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return view;		 }      		 public static menu getShape(){		   final menu viewImg = new menu(Ui.cd.getHt((int) Wh), Ui.cd.getHt((int) Ht),0,0);		   viewImg.mask = viewImg.S0;		   viewImg.maskPaint = viewImg.P0; 		   return viewImg;		 }     }//Finished...! 