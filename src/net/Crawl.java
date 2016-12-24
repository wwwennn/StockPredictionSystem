package net;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class Crawl {

	public static String getStock(String code){
//		byte[] sub = new byte[300];
		String result=null;
		try {
//			String urlraw="http://hq.sinajs.cn/list=";
//			String add=code;
			result=getReturnData("http://hq.sinajs.cn/list="+code);
//			sub=result.getBytes("UTF-8");
//			int len=result.length();
//			for(int i=0;i<len;i++){
//				sub[i]=(byte) result.charAt(i);
//			}
//			String ss=new String(sub,"UTF-8");
//			
//			System.out.println(result);
		} catch (UnsupportedEncodingException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return result;
	}
	
    public static String getReturnData(String urlString) throws UnsupportedEncodingException {  
        String res = "";   
        try {   
            URL url = new URL(urlString);  
            java.net.HttpURLConnection conn = (java.net.HttpURLConnection)url.openConnection();  
            conn.setDoOutput(true);  
            conn.setRequestMethod("POST");  
            java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(conn.getInputStream(),"gbk"));  
            String line;  
            while ((line = in.readLine()) != null) {  
                res += line;  
            }  
            in.close();  
        } catch (Exception e) {  
            e.printStackTrace();
        }  
//      System.out.println(res);  
        return res;  
    }  
}

