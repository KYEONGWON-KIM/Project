/*
 * ���� ȣ�� Crawling
 */

package practice.copy;
import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawler1 {
	public static <AreaDTO> void main(String[] args) {

		// Post ���(�⺻)
		Document doc = null;
		try {
			// 1. URL ����
			String conUrl = "https://www.goodchoice.kr/product/search/2";

			// 2. HTML ��������
			doc = Jsoup.connect(conUrl).post();

			// 3. ������ HTML Document Ȯ��
//            System.out.println(doc);

			// ȣ�� �̸�
			Elements ename = doc.select("div.name strong");
//			System.out.println(ename.eachText());

//            // ���� ����
//            Elements roomspace = doc.select("em.mark b");
//            System.out.println(roomspace.eachText());

			// �ݾ�
			Elements price = doc.select("div.price > p > b");
//			System.out.println(price.eachText());

			// ����
			Elements score = doc.select("p.score em");
//			System.out.println(score.eachText());

			//����
			Elements areas = doc.select("div.name > p:nth-child(4)");
			System.out.println(areas.eachText());

			Elements names = doc.select("div.name > p:nth-child(4)");

			 ArrayList<AreaDTO> v = new ArrayList<>();
            
	          for(int i = 1; i < areas.size();i++) {
//                String a = areas.toString().replace("|", ",");
//                String a = areas.eachText().get(i);
                Element a1 = areas.get(i);
//                String b1 = (a1.text()).replace("|", ",");
                String b1 = (((org.jsoup.nodes.Element) a1).text());

                int idx = b1.indexOf("|");
                String c1 = b1.substring(0, idx);
                
//                String[] c1 = b1.split(",");
                System.out.println(c1);
                
//                String c = a.replace("|", ",");
//                String[] d = c.split(",");
//                System.out.println(d[0]);
//                System.out.println(c.substring(0,3));
//                area.add(new AreaDTO(d[0],a.trim()));
//                System.out.println(area.get(i));
             }

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}