package foodVO;

import java.util.ArrayList;
import java.util.List;

//RestaurantList
public class FoodDAO {

   private static ArrayList<Food> arr;

   public FoodDAO() {
      if (arr == null) {
         Info();
      }
   }

   // 한식 -> 중식 -> 일식 -> 양식
   public List<Food> Info() {
      
      ArrayList<Food> arr = new ArrayList<Food>();
      
      arr.add(new Food("갈비찜", "소갈비나 돼지갈비를 간장에 재워 짭짤하면서 달콤한 맛이 나도록 조리한 음식", "한식", "서촌기와집 경복궁본점", "0507-1428-3911",
            "서울 종로구 자하문로1길 35", "k1",
            "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230829_39%2F1693288868153ou4I4_JPEG%2F1693288668079.jpg"
            ,"갈비찜.jpg"));

      arr.add(new Food("김치전", "익은 김치의 단맛과 전의 바삭한 식감이 조화를 이룬 음식", "한식", "송아저씨빈대떡", "02-338-4919",
            "서울특별시 서대문구 연세로7안길 29", "k2",
            "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA3MjVfMTE1%2FMDAxNjI3MTkwOTEyMDAx.Z-AOKMZSFkFHTjej3A_GXPEA9elmpmOjkdWkoPLbI3Yg.72TIlu_-BSaIcHVWpUvEuWSnesAZOa77DnUVViOMCXcg.JPEG.donial51%2F20210704_165754.jpg"
            , "김치전.jpg"));

      arr.add(new Food("냉면", "메밀국수를 무김치와 배추김치에 말고 돼지고기를 섞은 음식", "한식", "서관면옥 교대본점", "0507-1403-9946",
            "서울 서초구 서초대로56길 11", "k3",
            "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20181228_182%2F1545968245033IOiM7_JPEG%2Fk2gO9qPt-ThvM_yKWzJ46q-1.jpg"
            , "냉면.jpg"));

      arr.add(new Food("된장찌개", "된장을 푼 국물에 고기나 어패류, 채소 등을 넣고 끓인 국", "한식", "뚝배기집", "02-2265-5744", "서울 종로구 종로16길 12",
            "k4",
            "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyMzA3MzBfMTUy%2FMDAxNjkwNjY5MzkwMTQx.KyWA964u4GAA_J46rSGxra8yQCWRL0moIJGChqfkhVAg.gJdJHRp4ZqgQlmdn3sZQW0yMK7mjQGe6odGLCkfwiLkg.JPEG%2F20230730_061816.jpg"
            , "된장찌개.jpg"));

      arr.add(new Food("떡국", "맑은 장국에 가래떡을 얄팍하게 썰어 넣어 끓인 국", "한식", "새봄떡국국수", "02-739-0661", "서울 중구 새문안로 24", "k5",
            "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMzAxMjBfMjI1%2FMDAxNjc0MTc0ODYyOTgz.gWjYpa2eGRR1Izjp5VbV8_-QsF_yS-5DgjQtR8fPoccg.DhEBUUt3bksm3jvtayuu5L2PrFrkbvzX5KIUSAcNrxkg.JPEG.shin2136%2Foutput_1137795280.jpg"
            , "떡국.jpg"));

      arr.add(new Food("부대찌개", "진한 김치 양념 국물에 프레스햄과 소시지, 베이컨, 다짐육, 베이크드 빈즈 등을 주재료로 삼아 푹 끓여서 만드는 찌개", "한식", "대우부대찌개",
            "02-552-1663", "서울 강남구 테헤란로25길 34", "k6",
            "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyMzA5MDFfMjEg%2FMDAxNjkzNTcwNzQxMTE3.VhDzB-yPtk2Em-LdCKQFkLuhLrJgipS_iRBBrXm-A64g.9Nn96JcEv-lfs0h-doSah6xLD6b44J02ZeqppuISlmsg.JPEG%2F20230901_181113.jpg.jpg"
            , "부대찌개.jpg"));

      arr.add(new Food("불고기", "얇게 썬 소고기를 간장 양념에 재웠다가 구워 먹는 한국의 대표적인 고기 음식", "한식", "옛맛서울불고기", "0507-1315-9371",
            "서울 마포구 독막로 56", "k7",
            "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMzA4MjRfMjI0%2FMDAxNjkyODUwNzcwMTU4.ju-gnI5S7oPv9S_tRfW8F-4c0CeNsc-VrYkrnc1ZVwEg.CqEseikTDhTqd3ujNwB1zzV6mfCwjNr4jEe3ubSvzXMg.JPEG.show1957%2F5-3.jpg"
            , "불고기.jpg"));

      arr.add(new Food("비빔밥", "쌀밥에 고기나 나물 등과 여러 가지 양념을 넣어 비벼 먹는 음식", "한식", "꽃밥에피다", "0507-1362-0276",
            "서울 종로구 인사동16길 3-6", "k8",
            "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMzA5MDVfMjM4%2FMDAxNjkzODQzMjk0OTQx.1NyElWl8yh7cuyRk4565LMYFxSpOzt5uhleIto4xdMAg.1flDCeNYTKhYuTsMJL5jcH8JK5uRPe723YXZ3PgKN_Ig.JPEG.yonatimes%2FKakaoTalk_20230904_113221456_09.jpg"
            , "비빔밥.jpg"));

      arr.add(new Food("삼계탕", "어린 닭의 뱃속에 찹쌀과 마늘, 대추, 인삼을 넣고 물을 부어 오래 끓인 음식", "한식", "토속촌 삼계탕", "02-737-7444",
            "서울 종로구 자하문로5길 5 토속촌", "k9",
            "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMzA3MTdfOTEg%2FMDAxNjg5NTcwODM5NzQ0.2FFSfWcd08jWzeKCVbH5vpGQjHz2CDORgjjzlLNfKPog.p6AZCRmOt3pfCIQkNe8v-IaNnvkyTyYo355ePLXVmPcg.JPEG.zxqw1542%2F20230712_115435.jpg"
            , "삼계탕.jpg"));

      arr.add(new Food("설렁탕", "소의 머리, 내장, 뼈다귀, 발, 도가니 따위를 푹 삶아서 만든 국", "한식", "본가설렁탕", "0507-1497-1366",
            "서울 강남구 언주로148길 14 나동 1층 103호~106호", "k10",
            "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20210701_100%2F1625117575333cJOdr_JPEG%2F%25B2%25D9%25B9%25CC%25B1%25E219.jpg"
            , "설렁탕.jpg"));
// ----------------------------------------------------------------
      arr.add(new Food("짜장면", "채소와 돼지고기에 기름으로 튀긴 춘장을 넣어 굵은 국수에 비벼 먹는 요리", "중식", "만옥 롯데월드몰점", "02-3213-2845",
            "서울 송파구 올림픽로 300 롯데월드몰 지하1층", "c1",
            "https://search.pstatic.net/common/?src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20220416_24%2F1650119766591HfbCI_JPEG%2Fupload_b21c89e48e0254cc12dce0584264172c.jpg"
            , "짜장면.jpg"));
      
      arr.add(new Food("오향장육", "기름기가 적은 돼지고기 부위에 향신료를 넣어 오랫동안 삶은 중국 고기 요리", "중식", "편의방", "02-363-5887",
            "서울 서대문구 연희로 36", "c2",
            "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyMzA1MzFfNTAg%2FMDAxNjg1NTIxMjU1OTkw.Ylbq4kTp80pb2GTElEgAvSovtTTB8zW29TYKhPdXp5kg.tjn4koXbbVuls8k1nSt-44hSjzcHPUkbNBSPYJ1vS_8g.JPEG%2FIMG_3462.jpeg"
            , "오향장육.jpg"));
      
      arr.add(new Food("잡탕밥", "다양한 해물과 채소를 넣고 볶은 해물 소스를 밥 위에 올려 먹는 요리", "중식", "중차이", "02-765-0692",
            "서울 종로구 대학로7길 7 1층", "c3",
            "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyMzA4MTlfNjIg%2FMDAxNjkyNDU2MzExMjcw.zfCQfefggwHFQKOipSxuM168t8gRso3j60C0JbitmdMg.oGXlkN_1PHnw0zDHk3L9Z5O1x3cpuy35P-dQZ2m5xecg.JPEG%2F20230818_123514_copy_1000x563.jpg.jpg"
            , "잡탕밥.jpg"));
      
      arr.add(new Food("유린기", "녹말 튀김옷을 입혀 튀긴 닭고기에 간장 소스를 곁들인 음식", "중식", "한남동자리 한남점", "070-8278-2947",
            "서울 용산구 이태원로54길 5-5", "c4",
            "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyMzA2MDJfNDQg%2FMDAxNjg1Njc1MzUzMjI4.rrbcgXVVyQ0kzhzqbQntUIqubbjMXN1NnfC-2e9FCLsg.8vVyWvzDu6cFDBScY-hMtExQ0rdzd-Vkjv1W1PJOdcUg.JPEG%2FIMG_7805.jpeg"
            , "유린기.jpg"));
      
      arr.add(new Food("난자완스", "양념한 고기를 납작한 완자로 만들고 기름에 노롯하게 지져서 각종 채소와 볶아 만든 요리", "중식", "가담", "02-545-5163",
            "서울 강남구 언주로167길 35", "c5",
            "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyMzA1MTBfNTkg%2FMDAxNjgzNzI0NjA2ODQ0.BpOLmXFECclrb-00MV2EFw1ZI_y6BcMCSJ9zZDZKaEcg.O1k-46TmpM0IkFl1KHFUP_puRCtlqxqsC_eD0WoDIOIg.JPEG%2FIMG_7452.jpeg"
            , "난자완스.jpg"));
      
      arr.add(new Food("라조기", "튀긴 닭고기를 여러 야채와 함께 볶아 고추 양념을 가미한 요리", "중식", "홍릉각", "02-969-7787", "서울 동대문구 약령시로 90",
            "c6",
            "https://search.pstatic.net/common/?src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20210208_178%2F16127879364101GiWh_JPEG%2Fupload_5a2f468e0ec0ccf171e8a23979f74739.jpeg"
            , "라조기.jpg"));
      
      arr.add(new Food("마파두부", "두부를 주재료로, 두반장을 기본 양념으로 하여 고기, 향신채, 전분과 물을 넣어 만든 요리", "중식", "초류향", "02-775-2668",
            "서울 중구 다동길 24-10", "c7",
            "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyMzA4MzFfMjEz%2FMDAxNjkzNDg0MDExMTA5.076OxTGjPlIZX4rGu0GiHOgbfGRGdTX7swJ_8A0oKJcg.M1N2yy5Litczy_1qGLAM3krn-CjRIoT9H64XX5xCEzkg.JPEG%2F20230831_202833.jpg"
            , "마파두부.jpg"));
      
      arr.add(new Food("양장피", "각종 채소와 해산물을 넣고 매콤한 겨자소스를 부어 먹는 요리", "중식", "소동천", "0507-1491-3503",
            "서울 중구 퇴계로 456 1층 소동천", "c8",
            "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20210521_155%2F1621592672121D4Sxh_JPEG%2FWgQPVI3BNyODZS7A61UFxgCA.jpg"
            , "양장피.jpg"));
      
      arr.add(new Food("마라탕", "얼얼한 맛을 내는 중국 향신료를 이용해 만든 탕 요리", "중식", "라화쿵부 건대점", "0507-1464-7818",
            "서울 광진구 아차산로30길 42", "c9",
            "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20180404_248%2F1522806290377jATrV_PNG%2Fe9R9X3dYriEvUghca5GCiZ9S.png"
            , "마라탕.png"));
      
      arr.add(new Food("팔보채", "여덟 가지의 진귀한 재료와 채소를 강한 불에 볶은 요리", "중식", "차이들 논현점", "0507-1308-9298",
            "서울 서초구 신반포로45길 9-18 1층", "c10",
            "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20221107_291%2F1667807887301hPnoV_JPEG%2FKakaoTalk_20220702_204957874_28.jpg"
            , "팔보채.jpg"));
// -------------------------------------------------------------------
      arr.add(new Food("돈까스", "일본식 포크 커틀릿의 일종으로, 돼지고기에 밀가루, 달걀, 빵가루를 묻혀 튀겨낸 튀김 요리 ", "일식", "일월카츠", "0507-1339-7638",
            "서울 종로구 계동길 17 1층 일월카츠", "j1",
            "https://mblogthumb-phinf.pstatic.net/MjAyMzA3MDRfMTQ0/MDAxNjg4Mzk3NDMyNTk4.bfSE4BtkSxsdaSfXlsmtCZuBaWmGin5uDt5-T9h4KVkg.H1ctbZY6sw-h19SoddgNg0VdASsxPSg99iAKr7Poxw8g.JPEG.jkuen2/IMG_0463.jpg?type=w800"
            , "돈까스.jpg"));

      arr.add(new Food("라멘", "라멘은 밀가루로 만든 길고 얇은 면을 삶아 다양한 재료를 넣어 만든 중화풍의 일본 면 요리이다. ", "일식", "초이라멘", "02-766-7666",
            "서울 종로구 율곡로 290-2", "j2",
            "https://mblogthumb-phinf.pstatic.net/MjAyMDEwMTlfMjky/MDAxNjAzMDk0MzEyNjMw.osa0VTh717rJvWXSjV3dVr3ux1bibIYO25gs8jflfJog.pjSQa4I59URxW3cuhGuOAQI1dA2LcX3fRE82p5nmHacg.JPEG.high_hiho/SE-52979ee2-ad7b-48fa-8be3-da5af7b115a7.jpg?type=w800"
            , "라멘.jpg"));

      arr.add(new Food("마제소바", "마제소바 또는 타이완 마제소바는 일본 아이치현 나고야에서 만들어진 국수 요리", "일식", "거북이의꿈 서촌점", "0507-1347-2633",
            "서울 종로구 자하문로 31-6 1층 거북이의꿈 서촌점", "j3",
            "https://mblogthumb-phinf.pstatic.net/MjAyMjAyMTlfMjY2/MDAxNjQ1MjgyMzg0NDA2.Ys-D85y9nuoZjX-TBwXmYshOEaJv41MIMlbjd7CUcrUg.QRF8HWd5xb2umo1Z0VtsJogjK_nr2Q93SgenUsKlQLkg.JPEG.creaturedoll/5.jpg?type=w800"
            , "마제소바.jpg"));

      arr.add(new Food("무스비", "김으로 감싼 일본의 주먹밥", "일식", "오유스낵", "0507-1475-0397", "서울 노원구 노원로 421 103호", "j4",
            "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230724_99%2F1690181058179zqfgS_JPEG%2F20230706_123953.jpg&type=sc960_832"
            , "무스비.jpg"));

      arr.add(new Food("오니기리", "오니기리는 흰쌀밥에 여러 재료를 넣고 뭉쳐 만든 음식 ", "일식", "오니", "0507-1359-6015",
            "서울 관악구 관악로15길 26 102호", "j5",
            "https://mblogthumb-phinf.pstatic.net/MjAyMzA4MzBfMjU0/MDAxNjkzMzkxMTc2NjU2.RAgY39iE8ulJBKR07YRGjOkeiRwH_v_S7y6_u89LfJwg.o-1OChQwwKxsUPKSR_z88Fo7F5iwaPQ1QTMfu9oHXIUg.JPEG.mogul33/IMG_1944.jpg?type=w800"
            , "오니기리.jpg"));

      arr.add(new Food("오므라이스", "일본식야채와 고기를 넣어 만든 볶음밥을 달걀로 감싼 요리 ", "일식", "맨븟", "02-722-5273",
            "서울 종로구 새문안로5길 37 도렴빌딩 B1층 35호 맨븟", "j6",
            "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMzAzMjVfMSAg%2FMDAxNjc5NzQ3NDUyNDU3.10OwpNqvSZ54JpQRz2holh2EBWITRGX5y0IJJn7wOuog.Q6MusAg1Kz0ocN2tYw7ocnXsf41EPf24A7RISgQPfKIg.JPEG.michael0217%2FKakaoTalk_20230225_135148507_06.jpg&type=sc960_832"
            , "오므라이스."));

      arr.add(new Food("오코노미야끼", "한국의 빈대떡과 비슷한 일본의 부침 요리 ", "일식", "송암여관", "0507-1349-5938", "서울 종로구 돈화문로11나길 31-3",
            "j7",
            "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDEwMjlfMTk2%2FMDAxNjAzOTc2NTk4OTYz.XdAN7eRiKuNnvtNrRfBgePX005viqamJPsnjWFR_M3Qg.j-r4wfhjUek8WcUSW8fgovo5CqecTxPtEHeSYn0aoT0g.JPEG.insa7792%2FIMG_6955.jpg&type=sc960_832"
            , "오코노미야끼.jpg"));

      arr.add(new Food("우동", "우동은 통통한 면을 익혀 다양한 고명을 올려 먹는 일본의 면 요리 ", "일식", "오사카우동", "0507-1379-2554",
            "서울 종로구 대학로3길 12 1층", "j8",
            "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMzA3MDdfMTQz%2FMDAxNjg4NzExMTI1Mzg3.0lESILVP22kJXLtB8w3jxfQWgELxLfCkw3fIrmjJbBgg.5zlUcxPqCq33W5mA7nPu27qqzezKIWUzuIEkVfapJEMg.JPEG.ye_106%2FIMG_5126.jpg&type=sc960_832"
            , "우동.jpg"));

      arr.add(new Food("스시", "스시는 소금과 식초, 설탕으로 간을 한 밥 위에 얇게 저민 생선이나 김, 달걀, 채소 등을 얹거나 말아 만드는 일본의 대표 요리 ", "일식", "야스미",
            "0507-1435-2550", "서울 종로구 대명길 39-10", "j9",
            "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjExMjZfMTA0%2FMDAxNjY5NDQ4MzQ0Njk2.vBPsAUt9h4y9KiPA8ouhxtqimadhToqdEQz8C4q35Ccg.1JgXVyPrQRECeCMpyCWSaM2up2SLMZISuegOEiFTSRQg.JPEG.ramp5115%2F20221124%25A3%25DF210744.jpg&type=sc960_832"
            , "스시.jpg"));
      arr.add(new Food("텐동", "밥 위에 다양한 재료를 토핑으로 얹어 만드는 일본의 덮밥 요리 ", "일식", "고쿠텐 대학로점", "02-745-9447",
            "서울 종로구 대학로11길 34 고쿠텐", "j10",
            "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMzA3MTZfMjU4%2FMDAxNjg5NDMzODAzNTIx.5TO_b3ttRjdTeJAiJXNcBMaZ6uLC6rrWJKDW1nH5DOwg.yjIHrdAxs9OjXNwPwgmBSnIjUe0s1CByc1w0OJGHL9gg.JPEG.wjdtnswl7%2FAPC_1931.jpg&type=sc960_832"
            , "텐동.jpg"));
// ------------------------------------------------------------------

      arr.add(new Food("감바스", "소금과 후추로 간을 한 새우를 마늘, 페페론치노와 함께 올리브 오일에 넣어 낮은 온도에서 끓이는 음식", "양식", "슬로우",
            "0507-1379-0433", "서울 마포구 동교로46길 25 2", "a1",
            "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyMzA4MjNfODgg%2FMDAxNjkyNzUzNDcyNjAw.LJt4OUVGyzTHzzXRiRj0o7oTwrc7T1RShyGXbc2q-_og.p_9kZtEJlZ0s9Z3HDoyp64lmss_xSYW4c_qLis8825cg.JPEG%2F20230821_201925.jpg"
            , "감바스.jpg"));
      
      arr.add(new Food("그라탕", "오븐용 접시에 어류, 육류, 계란, 야채, 파스타 중 몇몇 재료를 섞어서, 소스와 함께 담아내어 그 위에 치즈와 빵가루를 뿌려 오븐에서 구워낸 요리",
            "양식", "까망", "070-4145-5546", "서울 성동구 연무장5가길 20", "a2",
            "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20220515_176%2F1652611410703LuhQX_JPEG%2F%25B1%25D7%25B6%25F3%25C5%25C1.jpg"
            , "그라탕.jpg"));
      
      arr.add(new Food("리조또", "이탈리아 요리 중 하나로, 쌀을 주재료로 사용해서 만드는 요리", "양식", "카멜로연남", "0507-1485-3838",
            "서울 마포구 연희로1길 57", "a3",
            "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20210315_65%2F1615751484576eyUMN_JPEG%2FamfK2HzklSETRdbwburS9kzD.jpg"
            , "리조또.jpg"));
      
      arr.add(new Food("브리또", "토르티야에 쇠고기나 닭고기, 콩, 밥 등을 얹어 네모 모양으로 감싼 다음(양념한 밥을 넣기도 한다) 살사를 발라서 먹는 멕시코 음식", "양식",
            "로꼬브리또 헬리오시티점", "02-404-3331", "서울 송파구 송파대로 345 2B상가", "a4",
            "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20210925_140%2F1632527914416cOKsI_JPEG%2F6dwb5L5C2Vc27uONH0HjkL42.jpg"
            , "브리또.jpg"));
      
      arr.add(new Food("스테이크", " 적당한 두께와 일정한 모양의 부위를 가진 고기를 달군 프라이팬에 굽거나 숯불구이처럼 석쇠에 올려서 굽는 음식", "양식", "익선디미방",
            "0507-1400-3418", "서울 종로구 수표로28길 17-27", "a5",
            "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20210117_185%2F1610856219061szQ1K_JPEG%2F4Rgr5D1Mw1G23nXQmO2JrM_i.jpg"
            , "스테이크.jpg"));
      
      arr.add(new Food("타코",
            "토르티야라고 불리는 옥수수나 밀가루를 반죽해서 구워 만든 얇은 무발효빵에 고기, 해물, 채소(잘게 썬 양파, 로메인과 고수 등.), 치즈 같은 것들을 얹어서 살사를 끼얹고 싸먹는 멕시코 요리",
            "양식", "타코튜즈데이 성수 본점", "0507-1319-0248", "서울 성동구 왕십리로10길 10", "a6",
            "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230227_202%2F167746955788300je5_JPEG%2F%25B8%25D3%25BD%25AC%25B7%25EB_%25C5%25B8%25C4%25DA.jpg"
            , "타코.jpg"));
      
      arr.add(new Food("파스타", "물과 듀럼밀 세몰리나를 반죽하여 만드는 이탈리아의 면과 이를 이용한 음식", "양식", "미테이블 성수점", "0507-1434-0089",
            "서울 성동구 왕십리로8길 5", "a7",
            "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20221014_67%2F1665673596823NMnDd_JPEG%2FIMG_1558.jpeg"
            , "파스타.jpg"));
      
      arr.add(new Food("포케", "포케는 하와이어로 '자르다', '십자형으로 조각내다'라는 뜻으로 익히지 않은 해산물과 채소를    소스에 비빈 하와이의 전통 음식", "양식", "오포케",
            "0507-1448-5572", "서울 광진구 능동로 117", "a8",
            "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230404_221%2F1680616290949dlsid_JPEG%2FKakaoTalk_20230215_210121185_27.jpg"
            , "포케.jpg"));
      
      arr.add(new Food("피자", "밀가루로 만든 얇고 납작한 반죽에 토마토 소스와 치즈 등 토핑을 얹어서 구워 내는    이탈리아에서 시작한 요리", "양식", "나폴리회관 강남역점",
            "0507-1316-5067", "서울 강남구 테헤란로5길 24", "a9",
            "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20200129_52%2F1580229196376pLkUV_JPEG%2FjaebQpfAiUXhPVWWBZdJkncM.jpg"
            , "피자.jpg"));
      
      arr.add(new Food("햄버거", "패티를 구운 후 다양한 부재료와 함께 빵 사이에 끼워 먹는 음식", "양식", "엘더버거 성수", "02-462-5612",
            "서울 성동구 서울숲2길 40-7", "a10",
            "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20200306_38%2F1583479591499pDp2f_JPEG%2F8eaHRSpbDv_7FMN0WD8X5aZb.jpeg.jpg"
            , "햄버거.jpg"));

      return arr;
   }
   
   public Food searchId (String id) {
      for(int i = 0; i < arr.size();i++) {
         if(arr.get(i).getId().equals(id)) {
            return arr.get(i);
         }
      } return null;
   }
   
   public Food searchCategoryName (String categoryName) {
      for(int i = 0; i < arr.size();i++) {
         if(arr.get(i).getCategoryName().equals(categoryName)) {
            return arr.get(i);
         }
      } return null;
   }
}