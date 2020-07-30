import React from "react";

const SearchContainer = (props) => {
  return (
    <div className="searchContainer">
      <div className="search">
        <input type="text" placeholder="검색어를 입력하세요." />
        <div className="searchButtonContainer">
          <img className="searchButton" src="/image/search.svg" alt="search" />
        </div>
      </div>
      <div className="tagsContainer">태그 보여주기 창</div>
    </div>
  );
};

export default SearchContainer;