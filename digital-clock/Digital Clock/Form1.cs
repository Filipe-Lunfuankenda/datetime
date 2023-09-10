using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Digital_Clock_Demo
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            this.Text = "Relógio Digital Demo";
            timer1.Start();
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            lblTempo.Text = DateTime.Now.ToString("HH:mm");
            lblSegundos.Text = DateTime.Now.ToString("ss");
            lblData.Text = DateTime.Now.ToString("dd MMMM yyyy");
            lblDia.Text = DateTime.Now.ToString("dddd");
            lblSegundos.Location = new Point(lblTempo.Location.X + lblTempo.Width-5, lblSegundos.Location.Y);
        }
    }
}
