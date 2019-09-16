const naming = menu => {
  let name = '';
  if (menu == 'beaf') {
    name = '소고기';
  } else if (menu == 'pork') {
    name = '돼지고기';
  } else if (menu == 'chicken') {
    name = '닭고기';
  }
  return name;
};
const price = menu => {
  let num = 0;
  if (menu == 'beaf') {
    num = 40000;
  } else if (menu == 'pork') {
    num = 12000;
  } else if (menu == 'chicken') {
    num = 15000;
  }
  return num;
};
const dutchPay = () => {
  let bill = '';
  const who = document.who.name.value;
  bill += '[' + who + '의 영수증]\n';
  // eslint(comma-dangle)
  const nameList = [
    document.input1.name.value,
    document.input2.name.value,
    document.input3.name.value,
  ];
  const menuList = [
    document.input1.menu.value,
    document.input2.menu.value,
    document.input3.menu.value,
  ];
  const oneReceipt = nameList.map((v, i) => {
    if (v == who) {
      return naming(menuList[i]) + ' : ' + price(menuList[i]) + '원\n';
    } else {
      return '';
    }
  });
  bill += '==========\n';
  oneReceipt.forEach(element => {
    if (element != '') {
      bill += element;
    }
  });
  bill += '==========\n';
  const onePrice = nameList.reduce((acc, cur, i) => {
    if (cur == who) {
      return acc + price(menuList[i]);
    } else {
      return acc;
    }
  }, 0);
  bill += '총 ' + onePrice + '원';
  alert(bill);
};
const totalPay = () => {
  let bill = '';
  bill += '[전체 영수증]\n';
  const menuList = [
    document.input1.menu.value,
    document.input2.menu.value,
    document.input3.menu.value,
  ];
  const totalReceipt = menuList.map(v => {
    if (price(v) != 0) {
      return naming(v) + ' : ' + price(v) + '원\n';
    }
    return '';
  });
  bill += '==========\n';
  totalReceipt.forEach(element => {
    bill += element;
  });
  bill += '==========\n';
  const totalPrice = menuList.reduce((acc, cur) => {
    return acc + price(cur);
  }, 0);
  bill += '총 ' + totalPrice + '원';
  alert(bill);
};
