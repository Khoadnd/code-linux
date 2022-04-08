new List<string>(txtInput.Text.Trim().Split(", ")).ForEach(n = > {
  if (!float.TryParse(n, out float temp)) {
    MessageBox.Show("Vui lòng kiểm tra lại input");
    errorProvider1.SetError(
        txtInput,
        "Vui lòng kiểm tra lại input!\r\nNhập vào dưới dạng mảng 1 chiều, mỗi "
        "phần tử cách nhau bởi dấu ', '\r\nVD: 7.5, 8, 10, 9, 10, 3");
    return;
  }
  if (temp < 0 || temp > 10) {
    MessageBox.Show("Điểm nhập vào không hợp lệ");
    errorProvider1.SetError(txtInput,
                            "Điểm không hợp lệ, vui lòng kiểm tra lại!");
    return;
  }
  score.Add(temp);
});