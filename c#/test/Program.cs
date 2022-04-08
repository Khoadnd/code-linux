Int64 factorial(int i) => Enumerable.Range(1, i < 1 ? 1 : i).Aggregate((f, x) => f * x);
            Int64 S(int i) => (Int64)(((1 + i) * i) / 2);           
            Int64 S1(int i, int j) => Enumerable.Range(1, j < 1 ? 1 : j).Aggregate(0, (x, y) => x += (int)Math.Pow(i, y));

            resultText.Text = "A! = "
                + factorial(a).ToString()
                + "\tB! = "
                + factorial(b).ToString()
                + "\r\nS1 = 1 + 2 + 3 + 4 + ... + A = "
                + S(a).ToString()
                + "\r\nS2 = 1 + 2 + 3 + 4 + ... + B = "
                + S(b).ToString()
                + "\r\nS3 = A^1 + A^2 + A^3 + A^4 + ... + A^B = "
                + S1(a, b).ToString();