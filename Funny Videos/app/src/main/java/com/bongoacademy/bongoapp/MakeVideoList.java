
package com.bongoacademy.bongoapp;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList {

	public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList;
	public static ArrayList< HashMap<String, String> > catArrayList;
	public static ArrayList< HashMap<String, String> > videoArrayList;
	public static HashMap<String, String> hashMap;


	//--------------------------------------------------------------------------------------------
	//===============================Some automation by Juba
	public static void addVideoItem(String video_id, String title, String desciption){
		hashMap = new HashMap<>();
		hashMap.put("vdo_id", video_id);
		hashMap.put("vdo_title", title);
		hashMap.put("vdo_desciption", desciption);
		videoArrayList.add(hashMap);
	}
	//========================================================================
	//===============================Some automation by Juba
	public static void createPlayList(String category_name, Integer drawable){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================





	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//----------------------------------------------------
	public static void createMyAlbums(){

		rootArrayList = new ArrayList();
		catArrayList = new ArrayList<>();
		videoArrayList = new ArrayList<>();

		//==========================================================================
		addVideoItem("GgaxcNmm4UU", "Ei Mom Jochonay | Madhubanti Mukherjee", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("jTK0b6qYfo0", "Daulat Shohrat Kya Karni", "Daulat Shohrat Kya Karni | Kailash Kher | Audio Song");
		addVideoItem("C0KtQQrFZ28", "Tera Naam Dhoka Rakh Du", "Tera Naam Dhoka Rakh Du");
		addVideoItem("Cptlr__Fwx4", "Shironamhin - Abar Hashimukh", "Shironamhin - Abar Hashimukh [Official Music Video] ");
		addVideoItem("lArX_cnBMlo", "Dreek - Jhornar Moto Chonchol (ঝর্নার মত চঞ্চল)", "Dreek - Jhornar Moto Chonchol (ঝর্নার মত চঞ্চল) Rock Version ");
		createPlayList("Funny Dog", R.drawable.category_1);
		//==========================================================================

		//==========================================================================
		addVideoItem("pHSIZyqLflE", "আরশের মেহমান | নবীর রওজা শরীফ", "আরশের মেহমান | নবীর রওজা শরীফ");
		addVideoItem("jTK0b6qYfo0", "Daulat Shohrat Kya Karni", "Daulat Shohrat Kya Karni | Kailash Kher | Audio Song");
		addVideoItem("C0KtQQrFZ28", "Tera Naam Dhoka Rakh Du", "Tera Naam Dhoka Rakh Du");
		addVideoItem("Cptlr__Fwx4", "Shironamhin - Abar Hashimukh", "Shironamhin - Abar Hashimukh [Official Music Video] ");
		addVideoItem("lArX_cnBMlo", "Dreek - Jhornar Moto Chonchol (ঝর্নার মত চঞ্চল)", "Dreek - Jhornar Moto Chonchol (ঝর্নার মত চঞ্চল) - Kazi Nazrul Islam - Rock Version ");
		createPlayList("Funny Cat", R.drawable.category_2);
		//==========================================================================


		//==========================================================================
		addVideoItem("GgaxcNmm4UU", "Ei Mom Jochonay | Madhubanti Mukherjee", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("jTK0b6qYfo0", "Daulat Shohrat Kya Karni", "Daulat Shohrat Kya Karni | Kailash Kher | Audio Song");
		addVideoItem("C0KtQQrFZ28", "Tera Naam Dhoka Rakh Du", "Tera Naam Dhoka Rakh Du");
		addVideoItem("Cptlr__Fwx4", "Shironamhin - Abar Hashimukh", "Shironamhin - Abar Hashimukh [Official Music Video] ");
		addVideoItem("lArX_cnBMlo", "Dreek - Jhornar Moto Chonchol (ঝর্নার মত চঞ্চল)", "Dreek - Jhornar Moto Chonchol (ঝর্নার মত চঞ্চল) Rock Version ");
		createPlayList("Funny Baby", R.drawable.category_3);
		//==========================================================================


		//==========================================================================
		addVideoItem("GgaxcNmm4UU", "Ei Mom Jochonay | Madhubanti Mukherjee", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("jTK0b6qYfo0", "Daulat Shohrat Kya Karni", "Daulat Shohrat Kya Karni | Kailash Kher | Audio Song");
		addVideoItem("C0KtQQrFZ28", "Tera Naam Dhoka Rakh Du", "Tera Naam Dhoka Rakh Du");
		addVideoItem("Cptlr__Fwx4", "Shironamhin - Abar Hashimukh", "Shironamhin - Abar Hashimukh [Official Music Video] ");
		addVideoItem("lArX_cnBMlo", "Dreek - Jhornar Moto Chonchol (ঝর্নার মত চঞ্চল)", "Dreek - Jhornar Moto Chonchol (ঝর্নার মত চঞ্চল) Rock Version ");
		createPlayList("Funny Memes", R.drawable.category_4);
		//==========================================================================













	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}

