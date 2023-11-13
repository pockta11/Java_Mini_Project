package foodVO;

public class Food {
   private String foodName; // 음식 이름
   private String foodContents; // 음식 설명
   private String categoryName; // 카테고리 이름
   private String placeName; // 가게 이름
   private String phone; // 가게 연락처
   private String addressName; // 가게 주소
   private String id; // 소문자로(c1, c2, k1)등
   private String imageUrl; // 홈페이지의 이미지 주소
   private String img; //음식 사진 40개
   

   public Food(String foodName, String foodContents, String categoryName, String placeName, String phone,
         String addressName, String id, String imageUrl, String img) {

      this.foodName = foodName;
      this.foodContents = foodContents;
      this.categoryName = categoryName;
      this.placeName = placeName;
      this.phone = phone;
      this.addressName = addressName;
      this.id = id;
      this.imageUrl = imageUrl;
      this.img = img;
   }

   public String getImg() {
      return img;
   }

   public void setImg(String img) {
      this.img = img;
   }

   public String getFoodName() {
      return foodName;
   }

   public void setFoodName(String foodName) {
      this.foodName = foodName;
   }

   public String getFoodContents() {
      return foodContents;
   }

   public void setFoodContents(String foodContents) {
      this.foodContents = foodContents;
   }

   public String getCategoryName() {
      return categoryName;
   }

   public void setCategoryName(String categoryName) {
      this.categoryName = categoryName;
   }

   public String getPlaceName() {
      return placeName;
   }

   public void setPlaceName(String placeName) {
      this.placeName = placeName;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public String getAddressName() {
      return addressName;
   }

   public void setAddressName(String addressName) {
      this.addressName = addressName;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getImageUrl() {
      return imageUrl;
   }

   public void setImageUrl(String imageUrl) {
      this.imageUrl = imageUrl;
   }

   public void infoShortPrint() {
      System.out.println("| 음식 이름 : " + foodName);
      System.out.println("| 매장 이름 : " + placeName);

   }

   public void infoFullPrint() {
      String printFoodName = ("| 음식 이름 : " + foodName);
      String printPlaceName = ("| 매장 이름 : " + placeName);
      String printCategoryName = ("| 카테고리 : " + categoryName);
      String printRoadAddressName = ("| 주소 : " + addressName);
      String printPhone = ("| 매장 연락처 : " + phone);

   }
}