package com.okayjava.html.model;

public class Product {

		
		private String originalBrand;
		private double guidancePrice;
		private double isvPrice;
		public String getOriginalBrand() {
			return originalBrand;
		}
		public void setOriginalBrand(String originalBrand) {
			this.originalBrand = originalBrand;
		}
		public double getGuidancePrice() {
			return guidancePrice;
		}
		public void setGuidancePrice(double guidancePrice) {
			this.guidancePrice = guidancePrice;
		}
		public double getIsvPrice() {
			return isvPrice;
		}
		public void setIsvPrice(double isvPrice) {
			this.isvPrice = isvPrice;
		}
		@Override
		public String toString() {
			return "details [originalBrand=" + originalBrand + ", guidancePrice=" + guidancePrice + ", isvPrice=" + isvPrice
					+ "]";
		}
		
		

	}



