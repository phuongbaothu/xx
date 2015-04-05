/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbpView;

/**
 *
 * @author phamquocbao
 */
public class ViewPart {
    public enum VIEWCONTENT {
        LoginView ,
        RegisterView,
        Info,
        
} 

    public String loadCSSSource()
    {
        String source = "<link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" media=\"all\">\n" +
"<link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" media=\"all\">\n" +
"<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\">\n" +
"<link rel=\"stylesheet\" href=\"css/menustyle.css\" type=\"text/css\" media=\"all\">\n" +
"<link rel=\"stylesheet\" href=\"css/VericailMenu.css\" type=\"text/css\" media=\"all\">";
        return source;
    }
            
    public String loadBeginWrap()
    {
        String beginWrap = "<div class=\"wrap\">";
        return beginWrap;
     
    }
      public String loadEndWrap()
    {
        String endWrap = "</div>";
        return endWrap;
       
    }        
    public String loadHeader()
    {
        String header = "<div class=\"header\">\n" +
"   <div class=\"container\">\n" +
"         <h1 id=\"for_all\"><a href=\"index.html\">Nha Khoa TBP</a></h1>\n" +
"    <div id=\"nav1\">     \n" +
"      <ul class=\"menu\">\n" +
"		<li><a href=\"/\">Trang Chủ</a></li>\n" +
"\n" +
"		<li>\n" +
"			<a href=\"GioiThieu.html\">Giới Thiệu</a>\n" +
"			\n" +
"		</li>\n" +
"		<li>\n" +
"			<a href=\"DichVu.html\">Dịch Vụ</a>\n" +
"		<ul>\n" +
"				<li>\n" +
"					<a href=\"NhaKhoaTongQuat.html\">Nha Khoa Tổng Quát</a>\n" +
"								\n" +
"				</li>\n" +
"				<li>\n" +
"					<a href=\"NhaKhoaThamMy.html\">Nha Khoa Thẩm Mỹ</a>\n" +
"										\n" +
"				</li>\n" +
"                <li>\n" +
"					<a href=\"Implant.html\">Implant</a>\n" +
"										\n" +
"				</li>\n" +
"                <li>\n" +
"					<a href=\"ChinhNha.html\">Chỉnh Nha</a>\n" +
"										\n" +
"				</li>\n" +
"                <li>\n" +
"					<a href=\"PhucHinh.html\">Phục Hình</a>\n" +
"										\n" +
"				</li>\n" +
"                <li>\n" +
"				<a href=\"NhaKhoaTreEm.html\">Nha Khoa Trẻ Em</a></li>\n" +
"		</ul>\n" +
"		</li>\n" +
"		<li><a href=\"PhiDichVu.html\">Phí Dịch Vụ</a></li>\n" +
"		<li><a href=\"BanCanBiet.html\">Bạn Cần Biết</a></li>\n" +
"        <li><a href=\"NavController?nav=login\">Đăng Nhập</a></li>\n" +
"        <li><a href=\"DangXuat.html\">Đăng Xuất</a></li>\n" +
"        <li><a href=\"LienHe.html\">Liên Hệ</a></li>\n" +
"	</ul>\n" +
"   \n" +
"   </div>\n" +
"\n" +
"     \n" +
"      \n" +
"   </div>\n" +
"   </div>";
        return header;
    }
    public  String loadBeginContainer()
    {
        String container = " <div class=\"container\">";
        return container;
    }
      public  String loadEndContainer()
    {
        String container = "   <div class=\"clear\"></div>\n" +
"   </div>";
        return container;
    }
      public  String loadLeftMemu()
      {
          String leftMenu ="<div class=\"aside\">\n" +
"         <div id=\"menu14\">\n" +
"\n" +
"<ul>\n" +
"        \n" +
"<li><a id=\"current\" href=\"#\">Dịch Vụ</a></li>\n" +
"\n" +
"<li><a href=\"NhaKhoaTongQuat.html\">Nha Khoa Tổng Quát</a></li>\n" +
"\n" +
"<li><a href=\"NhaKhoaThamMy.html\">Nha Khoa Thẩm Mỹ</a></li>\n" +
"\n" +
"<li><a href=\"Implant.html\">Implant</a></li>\n" +
"\n" +
"<li><a href=\"ChinhNha.html\">Chỉnh Nha</a></li>\n" +
"\n" +
"<li><a href=\"PhucHinh.html\">Phục Hình</a></li>\n" +
"\n" +
"<li><a href=\"NhaKhoaTreEm.html\">Nha Khoa Trẻ Em</a></li>\n" +
"\n" +
"</ul>\n" +
"\n" +
"</div>\n" +
"     </div>";
          return leftMenu;
      }
              
    public String  loadContent()
    {
        String content = "       <div class=\"cont-bot\" ><img src=\"images/baby.jpg\"  width=\"200\" align=\"middle\"/></div>\n" +
"       \n" +
"      <div class=\"section\" id=\"content\">\n" +
"         <div class=\"wrapper\">\n" +
"            <div class=\"article col-1\">\n" +
"               <h2>Cách chăm sóc răng</h2>\n" +
"               <img src=\"images/page1-img.jpg\" class=\"imgb\" alt=\"\" />\n" +
"               <p class=\"p1\">Ðánh răng đúng cách giúp giảm thiểu được nguy cơ mắc các chứng bệnh sâu răng và cơ lợi, một nguyên nhân chính làm cho răng rụng. Sử dụng bàn chải mềm và kem đánh răng có chất florua được chứng nhận bởi <strong>Hội Nha Hoa Kỳ (ADA)</strong> để làm sạch các mảng bợn răng và đồ ăn dính. Thay mới bàn chải sau mỗi ba tháng.\n" +
" </p>\n" +
"               <p class=\"p0\">Ðánh răng cả bề trong lẫn ngoài của hàm. Cầm bàn chải theo góc 45 độ và đánh theo biên độ bằng khoảng cách của nửa chiều ngang một chiếc răng và đánh dọc theo đường viền cơ lợi.\n" +
"Ở những bề mặt tiếp xúc khi nhai, cầm bàn chải ngang và đánh qua lại.		\n" +
"Ở mặt trong của các răng phía trước, nghiêng bàn chải hơi đứng và dùng đầu bản chải đánh nhẹ lên xuống.		\n" +
"Chà lưỡi từ trong ra ngoài bằng động tác quét để lấy ra các mảnh thức ăn còn dính và làm cho hơi thở khỏi bị hôi.\n" +
"</p>\n" +
"<p class=\"p1\"> <strong>DÙNG DÂY XỈA RĂNG ÐÚNG CÁCH</strong>\n" +
"Dùng dây xỉa răng hằng ngày để làm sạch bợn răng và các mảnh thức ăn còn tồn đọng ở các kẽ răng cũng như kẽ lợi tận phía dưới đường viền.\n" +
"</p>\n" +
"            </div>\n" +
"           <div class=\"article col-2\">\n" +
"               <h2>Recent Articles</h2>\n" +
"               <ul class=\"list\">\n" +
"                  <li><strong>Chuyên Khoa</strong>\n" +
"                  <li> - Chỉnh Nha</li>\n" +
"                  <li> - Phục Hình</li>\n" +
"                  <li> - Nha Khoa Tổng Quát</li>\n" +
"                  <li> - Implant</li>\n" +
"                  </li>\n" +
"                  <li><strong>Tiêu Chí</strong> Nha Khoa TBP luôn đặt sự hài lòng của bệnh nhân lên hàng đầu</li>\n" +
"                  <li><strong>Dermatology surgery</strong>Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Pellentesque sagittis tortor eros. </li>\n" +
"                  <li><strong>Diabets clinic</strong>Nullam ac diam nisl, a consequat orci. Nunc faucibus diam ut mi sollicitudin a convallis nunc cursus. Cras adipiscing ligula vel orci convallis congue.</li>\n" +
"               </ul>\n" +
"            </div>\n" +
"        </div>\n" +
"     </div>";
        return content;
    }
    public  String loadRightMenu()
    {
        String rightMemu ="<div class=\"rightmenu\">\n" +
"       <div id=\"menu14\">\n" +
"\n" +
"<ul>\n" +
"        \n" +
"<li><a id=\"current\" href=\"#\">Kết nối</a></li>\n" +
"\n" +
"<li><a href=\"#\">Đăng Ký Khám</a></li>\n" +
"\n" +
"<li><a href=\"#\">Hồ Sơ Khám</a></li>\n" +
"\n" +
"<li><a href=\"#\">Kết Quả Khám</a></li>\n" +
"\n" +
"<li><a href=\"#\">Giờ Làm Việc</a></li>\n" +
"\n" +
"<li><a href=\"#\">Nhân Sự</a></li>\n" +
"\n" +
"<li><a href=\"#\">Liên Hệ</a></li>\n" +
"\n" +
"</ul>\n" +
"\n" +
"</div>\n" +
"     </div>";
        return rightMemu;
    }
    public  String loadFooter()
    {
        String fotter = "<div class=\"footer\">\n" +
"   <div class=\"container\">\n" +
"   \n" +
"      		<div class=\"social\">\n" +
"            	<div id=\"face\"><a href=\"https://www.facebook.com\"><img src=\"images/facebook.png\" alt=\"\" /></a></div>\n" +
"                <div id=\"twitter\"><a href=\"https://www.facebook.com/phuongphuong0889\"><img src=\"images/twitter.png\" alt=\"\" /></a></div>\n" +
"                <div id=\"youtube\"><a href=\"http://www.youtube.com\"><img src=\"images/youtube.png\" alt=\"\" /></a></div>\n" +
"      		</div>\n" +
"      <div class=\"inside\"> Copyright &copy; 2015. TBP All right reserved .<br>\n" +
"         </div>\n" +
"   </div>\n" +
"</div>";
        return fotter;
    }
    public String loginViewPart()
    {
        String loginpart = "<div class=\"section\" id=\"content\">\n" +
"         <div class=\"wrapper\">\n" +
"        </div>\n" +
"     </div>";
        return loginpart;
    }
    public String loadView(VIEWCONTENT viewcontent)
    {
       String content = "";
 
     content = loadBeginWrap() + loadHeader()+
             loadBeginContainer()+loadLeftMemu()+
             loadContent(viewcontent)+
             loadRightMenu()+ loadEndContainer()+ 
             loadEndWrap()+
             loadFooter();
       
  //    out.println(viewPart.loadBeginWrap());
//     out.println(viewPart.loadHeader());
//     out.println(viewPart.loadBeginContainer());
//     out.println(viewPart.loadLeftMemu());
//     out.println(viewPart.loadContent());
//      out.println(viewPart.loadRightMenu());
//      out.println(viewPart.loadEndContainer());
//    out.println(viewPart.loadEndWrap());
//       out.println(viewPart.loadFooter());
        return  content;
    }
    public String loadContent(VIEWCONTENT viewContent)
    {
         String content = "";
         switch (viewContent)
         {
             case LoginView:
                 content=LoadLoginForm();
                 break;
             case RegisterView:
                 content=loadRegisterForm();
                 break;
             case Info:
                 content=loadinfo();
                 default: 
                     break;
              
         }
         
          return  content;
    }
    
    public String loadRegisterForm()
    {
        String register ="<div class=\"section\" id=\"content\">\n" +
"         <div id=\"stylized\" class=\"myform\">\n" +
" 		 			 <h1>Sign-up form</h1>\n" +
"  			 <p align=\"center\">  <strong> ĐÂY LÀ TRANG ĐĂNG KÝ CHO NGƯỜI DÙNG MỚI</strong></p>\n" +
" \n" +
"  	   		<label>Tên\n" +
" 		<span class=\"small\">Thêm vào tên</span>\n" +
"   			</label>\n" +
" 		<input type=\"text\" name=\"name\" id=\"name\" />\n" +
" \n" +
" 		<label>Email\n" +
" 		<span class=\"small\">Điền vào email</span>\n" +
"	   	</label>\n" +
"	 		<input type=\"text\" name=\"email\" id=\"email\" />\n" +
" \n" +
"  			<label>Password\n" +
" 		<span class=\"small\">Ít nhất 6 ký tự</span>\n" +
"  		 </label>\n" +
" 		<input type=\"text\" name=\"password\" id=\"password\" />\n" +
" 		\n" +
"  			<label>Nhập lại Password\n" +
" 		<span class=\"small\">Ít nhất 6 ký tự</span>\n" +
"  		 </label>\n" +
" 		<input type=\"text\" name=\"password\" id=\"password\" />\n" +
" \n" +
"   	  <button  type=\"submit\">Đăng Ký</button>\n" +
" <div class=\"spacer\"></div>\n" +
" \n" +
"\n" +
" </div>\n" +
"     </div>";
        return register; 
                
    }
    public String loadinfo()
    {
        String info="<div class=\"section\" id=\"content\">\n" +
"      <h2 align=\"center\"><strong>NHA KHOA TỔNG QUÁT</strong></h2>\n" +
"       \n" +
"		<p align=\"left\">.1 Lấy vôi răng định kỳ</p>\n" +
"			<p align=\"center\"><img alt=\"\" src=\"images/nktq1.jpg\" style=\"width: 400px; height: 300px;\" /></p>\n" +
"		<p align=\"left\">.2 Tẩy trắng răng tại nhà</p>\n" +
"        <p align=\"left\">.3 Tẩy trắng răng tại phòng khám</p>\n" +
"			<p align=\"center\"><img alt=\"\" src=\"images/nktq2.jpg\" style=\"width: 400px; height: 300px;\" /></p>\n" +
"         \n" +
"            <p align=\"center\"><img alt=\"\" src=\"images/nktq3.jpg\" style=\"width: 400px; height: 300px;\" /></p>\n" +
"	 <p align=\"left\">.4Trám răng sâu bằng composite </p>\n" +
"		<p align=\"center\"><img alt=\"\" src=\"images/nktq4.jpg\" style=\"width: 400px; height: 300px;\" /><img alt=\"\" src=\"images/nktq5.jpg\" style=\"width: 400px; height: 300px;\" /></p>\n" +
"\n" +
"     </div>";
        return info;
    }
      public  String LoadLoginForm()
    {
        String login ="<form action=\"NavController\" method=\"POST\">"+
                "<div class=\"section\" id=\"content\">\n" +
                
"         <div id=\"stylized\" class=\"myform\">\n" +
" 		 			 <h1>Sign-up form</h1>\n" +
"  			 <p align=\"center\">  <strong> LOGIN VAO HE THONG  </strong></p>\n" +
" \n" +
"  	   		<label align=\"center\">Tên\n" +
" 		<span class=\"small\"></span>\n" +
"   			</label>\n" +
" 		<input type=\"text\" name=\"name\" id=\"name\" />\n" +
" \n" +

"  			<label>Password\n" +
	
"  		 </label>\n" +
" 		<input type=\"text\" name=\"password\" id=\"password\" />\n" +
" 		\n" +
         "<div id=\"divbutton\"> "+      
"   	  <button  type=\"submit\">Đăng NHAP</button> " +
"          <button  type=\"submit\" name =\"doaction\">Đăng Ky</button>" +
                "</div>"+
" <div class=\"spacer\"></div>\n" +
" \n" +
"\n" +
" </div>\n" +
"     </div>"+
                "</form>";
        return login;
    }
            
}
