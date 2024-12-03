const mongoose = require('mongoose');

const xeMaySchema = new mongoose.Schema({
  ten_xe: {
    type: String,
    required: true
  },
  mau_sac: {
    type: String,
    required: true
  },
  gia_ban: {
    type: Number,
    required: true,
    default: 0
  },
  mo_ta: {
    type: String
  },
  hinh_anh: {
    type: String
  }
});

const XeMay = mongoose.model('XeMay', xeMaySchema);

module.exports = XeMay;
