using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExercisePOO
{
    class Forme_geometrique
    {
        public struct forme
        {
            public float x;
            public float y;

            public forme(float x , float y)
            {
                this.x = x;
                this.y = y;
            }

            public float X
            {
                get
                {
                    return this.x;
                }
                set
                {
                    this.x = value;
                }
            }
            public float Y
            {
                get
                {
                    return this.y;
                }
                set
                {
                    this.y = value;
                }
            }
            public void deplacer()
            {

            }

        }
    }
}
