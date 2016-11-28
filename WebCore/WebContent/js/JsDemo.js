/**
 * 
 */
function withDemo() {
	var x,y;
	with (Math) {
		x = cos(3 * PI) + sin(LN10);
		y = tan(14 * E);
	}
	document.write("x = " + x + " y = " + y);
}

function pluginsDemo() {
	var len = navigator.plugins.length;
	with (document) {
		write("你的浏览器共支持" + len + "种外挂插件：<BR>");
		write("<TABLE BORDER=1>")
		write("<CAPTION>外挂插件清单</CAPTION>")
		write("<TR><TH> <TH>名称<TH>描述<TH>文件名")
		for (var i = 0; i < len; i++)
			write("<TR><TD>" + i + "<TD>" + navigator.plugins[i].name + "<TD>"
					+ navigator.plugins[i].description + "<TD>"
					+ navigator.plugins[i].filename);
	}
}

function screenDemo() {
	console.info("screen.width:" + screen.width + "screen.colorDepth :"
			+ screen.colorDepth)
	if (screen.width < 800 || screen.colorDepth < 8) {
		var msg = "本网站最佳浏览模式为 800 * 600 * 256";
		alert(msg);
	}
}

function cfm() {
	if (confirm("确定离开么?"))
		// 关闭当前窗口,下面两个方法都可以
		// window.close();
		self.close();
	else
		return false
}

window.onload = initAll;
function initAll() {
	document.getElementsByTagName("form")[0].onsubmit = function() {
		return addNode();
	}
}

function addNode() {
	var inText = document.getElementById("textArea").value;
	var newText = document.createTextNode(inText);
	var newGraf = document.createElement("p");
	newGraf.appendChild(newText);
	var docBody = document.getElementsByTagName("body")[0];
	docBody.appendChild(newGraf);

	return false; // 此处不可以省略，起到抑制默认行为的作用
}

function delNode() {
	var allGrafs = document.getElementsByTagName("p");
	if (allGrafs.length > 1) {
		var lastGraf = allGrafs.item(allGrafs.length - 1)
		var docBody = document.getElementsByTagName("body")[0]
		docBody.removeChild(lastGraf)
	}
	// return false;
}
function addContentForTexArea() {
	var allGrafs = document.getElementsByTagName("p");
	if (allGrafs.length > 1) {
		var fisrtGraf = allGrafs.item(0)
		var txtArea = fisrtGraf.childNodes[1];
		txtArea.value= "268";
	}
	// return false;
}

function insertBeforeDemo() {
	var newItem = document.createElement("LI");
	var textnode = document.createTextNode("MMM");
	newItem.appendChild(textnode)

	var list = document.getElementById("List");
	list.insertBefore(newItem, list.childNodes[0]);
	return false;
}

function replaceChildDemo() {
	var newItem = document.createElement("LI");
	var textnode = document.createTextNode("YYY");
	newItem.appendChild(textnode)
	
	var list = document.getElementById("List");
	list.replaceChild(newItem, list.childNodes[0]);
	return false;
}

function clearDemo() {
	document.write("5654154545");
	document.clear();	//目前不支持 2016-11-24
	document.write("****5654154545");
	document.close();
}
