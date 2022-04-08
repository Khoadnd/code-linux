#include <iostream>
#include <string>

extern "C" {
#define STB_IMAGE_IMPLEMENTATION
#include "include/stb_image.h"
#define STB_IMAGE_WRITE_IMPLEMENTATION
#include "include/stb_image_write.h"
}

int main() {

  std::string filename = "image.png";
  int width, height;

  unsigned char *data =
      stbi_load(filename.c_str(), &width, &height, nullptr, 3);

  std::cout << "Image width = " << width << "\nImage height = " << height
            << std::endl;
  // unsigned int gen_data[14]{255, 255, 255, 255, 255, 255, 255,
  //                           255, 255, 255, 255, 255, 255, 255};
  // stbi_write_png("image_generated.png", 2, 2, 3, gen_data, 14);

  for (int i = 0; i < 300; i++)
    std::cout << (int)data[i] << " ";

  return 0;
}