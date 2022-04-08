#include <iostream>
#include <string>

std::string Encrypt(const std::string, const std::string);
std::string Decrypt(const std::string, const std::string);

const std::string plaintext = "DoanNguyenDangKhoa";
const std::string key = "WTFWTFWTFWTFWTFWTF";

int main() {
  std::cout << Encrypt(plaintext, key) << "\n";
  std::cout << Decrypt(Encrypt(plaintext, key), key);
  return 0;
}

std::string Encrypt(const std::string _plainttext, const std::string _key) {
  std::string ciphertext = "";
  std::string plainttext = _plainttext;
  std::string key = _key;

  while (plainttext.length() > key.length())
    key.append(key);

  for (auto &c : plainttext)
    c = toupper(c);
  for (auto &c : key)
    c = toupper(c);

  for (int i = 0; i < plainttext.length(); i++)
    ciphertext += (plainttext[i] + key[i]) % 26 + 'A';

  return ciphertext;
}

std::string Decrypt(const std::string _secret, const std::string _key) {
  std::string plaintext = "";
  std::string secret = _secret;
  std::string key = _key;

  while (secret.length() > key.length())
    key.append(key);

  for (auto &c : secret)
    c = toupper(c);
  for (auto &c : key)
    c = toupper(c);

  for (int i = 0; i < secret.length(); i++)
    plaintext += (secret[i] - key[i] + 26) % 26 + 'A';

  return plaintext;
}

std::string Decrypt(std::string secret) { return {}; }